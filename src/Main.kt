import java.awt.*

private fun createAndShowGUI() {
    val frame = ChessBoard("Chess")
    frame.isVisible = true
}

fun main() {
    EventQueue.invokeLater(::createAndShowGUI)
}