import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import kotlin.browser.document

fun initCanvas():HTMLCanvasElement{
    val canvas = document.getElementById("mainCanvas") as HTMLCanvasElement
    val context = canvas.getContext("2d") as CanvasRenderingContext2D
    return canvas
}

fun setBackground(){
    val canvas = document.getElementById("mainCanvas") as HTMLCanvasElement
    val context = canvas.getContext("2d") as CanvasRenderingContext2D

    context.save()
    context.fillStyle = "#5C7EED"
    context.fillRect(0.0, 0.0, 100.00, 100.00)
    context.restore()
}