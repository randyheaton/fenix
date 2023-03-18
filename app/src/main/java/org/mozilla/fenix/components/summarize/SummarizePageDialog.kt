package org.mozilla.fenix.components.summarize

import android.app.AlertDialog
import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.RelativeLayout
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import org.mozilla.fenix.R
import org.mozilla.fenix.ext.components
import org.mozilla.gecko.util.ThreadUtils.runOnUiThread

class SummarizePageDialogExteriorFrame(context: Context): RelativeLayout(context) {
    init {
        inflate(context, R.layout.dialog_summarize_page, this)
    }
}

class SummarizePageDialog(val context: Context, val url:String): UsesPageSummaryQueryDispatcher {

    val exteriorFrame = SummarizePageDialogExteriorFrame(context)
    val dialog = AlertDialog.Builder(context)
        .setView(exteriorFrame)
        .create()
    val progressIndicator = exteriorFrame.findViewById<ProgressBar>(R.id.progress_indicator)
    val summaryContent = exteriorFrame.findViewById<androidx.appcompat.widget.AppCompatTextView>(R.id.summary_content)
    val dismissButton = exteriorFrame.findViewById<ImageView>(R.id.summary_dismiss_button).apply{
        setOnClickListener{
            dialog.dismiss()
        }
    }


    fun displayFinal(){
        val width = (context.resources.displayMetrics.widthPixels * 0.80).toInt()
        val height = (context.resources.displayMetrics.heightPixels * 0.80).toInt()
        dialog.show()
        dialog.window?.setLayout(width,height)
        val pageSummaryQueryDispatcher = PageSummaryQueryDispatcher(context, url, this)
        CoroutineScope(context =Dispatchers.IO).launch{
            pageSummaryQueryDispatcher.dispatch()
        }
    }

    override fun onSummaryReceived(summary: String) {
        progressIndicator.visibility = View.GONE
        summaryContent.text = summary
    }

    override fun onError() {
        progressIndicator.visibility = View.GONE
        summaryContent.text = context.getString(R.string.summary_error)
    }
}