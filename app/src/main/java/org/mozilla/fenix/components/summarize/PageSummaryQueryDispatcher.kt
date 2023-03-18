package org.mozilla.fenix.components.summarize


import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import mozilla.components.concept.fetch.Client
import mozilla.components.concept.fetch.MutableHeaders
import mozilla.components.concept.fetch.Request
import org.mozilla.fenix.BuildConfig
import org.mozilla.fenix.ext.components
import org.mozilla.gecko.util.ThreadUtils.runOnUiThread

/**
 * Allows implementing classes to use a PageSummaryQueryDispatcher
 */
interface UsesPageSummaryQueryDispatcher {
    /**
     * invoked when a page summary is received
     *
     * runs on UI thread
     *
     * @param summary the summary of the page
     *
     */
    fun onSummaryReceived(summary: String)

    /**
     * generalized error state handler
     *
     * runs on UI thread
     */
    fun onError()
}

@Serializable
data class PageSummaryRequestModel(
    val model: String,
    val prompt: String,
    val max_tokens: Int,
    val temperature: Double
)

@Serializable
data class PageSummaryResponseModel(
    val choices: List<PageSummaryChoiceModel>
)

@Serializable
data class PageSummaryChoiceModel(
    val text: String,
    val index: Int,
    val logprobs: List<Double>?,
    val finish_reason: String
)



class PageSummaryQueryDispatcher(val context: Context, val url: String, val usesPageSummaryQueryDispatcher: UsesPageSummaryQueryDispatcher) {
    val DEFAULT_PROMPT_FORMULA = "Please summarize the contents of this webpage: %s"

   suspend fun dispatch(){
       val jsonBody = Json.encodeToString(PageSummaryRequestModel.serializer(), PageSummaryRequestModel(
           model = "text-davinci-003",
           prompt = String.format(DEFAULT_PROMPT_FORMULA, url),
           max_tokens = 60,
           temperature = 0.7
       ))
       val headers = MutableHeaders()
       headers.set("Content-Type", "application/json")
       headers.set("Authorization", "Bearer " + BuildConfig.SUMMARY_TOKEN)
       withContext(Dispatchers.IO){
            val client = context.components.core.client
            val request = Request(url = BuildConfig.SUMMARY_URL,
                method = Request.Method.POST,
                headers = headers,
                body = Request.Body.fromString(jsonBody)  )
            try {
                val response = client.fetch(request)
                val summary = Json{ ignoreUnknownKeys = true }.decodeFromString(PageSummaryResponseModel.serializer(), response.body.string())
                runOnUiThread{usesPageSummaryQueryDispatcher.onSummaryReceived(summary.choices[0].text)}
            } catch (e: Throwable) {
                println(e.message)
                runOnUiThread{usesPageSummaryQueryDispatcher.onError()}
            }
        }
    }

    }

