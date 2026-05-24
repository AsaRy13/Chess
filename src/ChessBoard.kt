import javax.swing.*
import javax.swing.SwingConstants.LEADING
import java.awt.*

class ChessBoard(title: String) : JFrame() {
    init{
        createUI(title)
    }

    private fun createUI(title: String) {
        val boardPattern = arrayOf<Color>(
            Color.white, Color.black, Color.white, Color.black, Color.white, Color.black, Color.white, Color.black,
            Color.black, Color.white, Color.black, Color.white, Color.black, Color.white, Color.black, Color.white,
            Color.white, Color.black, Color.white, Color.black, Color.white, Color.black, Color.white, Color.black,
            Color.black, Color.white, Color.black, Color.white, Color.black, Color.white, Color.black, Color.white,
            Color.white, Color.black, Color.white, Color.black, Color.white, Color.black, Color.white, Color.black,
            Color.black, Color.white, Color.black, Color.white, Color.black, Color.white, Color.black, Color.white,
            Color.white, Color.black, Color.white, Color.black, Color.white, Color.black, Color.white, Color.black,
            Color.black, Color.white, Color.black, Color.white, Color.black, Color.white, Color.black, Color.white
        )

        val labels = boardPattern.map {
            JLabel("", null, LEADING).apply {
                minimumSize = Dimension(100, 100)
                background = it
                isOpaque = true
            }
        }

        createLayout(labels)

        setTitle(title)
        defaultCloseOperation = EXIT_ON_CLOSE
        setLocationRelativeTo(null)
    }

    private fun createLayout(labels: List<JLabel>) {
        val gl = GroupLayout(contentPane)
        contentPane.layout = gl

        gl.setHorizontalGroup(
            gl.createParallelGroup()
                .addGroup(
                    gl.createSequentialGroup()
                        .addComponent(labels[0])
                        .addComponent(labels[1])
                        .addComponent(labels[2])
                        .addComponent(labels[3])
                        .addComponent(labels[4])
                        .addComponent(labels[5])
                        .addComponent(labels[6])
                        .addComponent(labels[7])
                )
                .addGroup(
                    gl.createSequentialGroup()
                        .addComponent(labels[8])
                        .addComponent(labels[9])
                        .addComponent(labels[10])
                        .addComponent(labels[11])
                        .addComponent(labels[12])
                        .addComponent(labels[13])
                        .addComponent(labels[14])
                        .addComponent(labels[15])
                )
                .addGroup(
                    gl.createSequentialGroup()
                        .addComponent(labels[16])
                        .addComponent(labels[17])
                        .addComponent(labels[18])
                        .addComponent(labels[19])
                        .addComponent(labels[20])
                        .addComponent(labels[21])
                        .addComponent(labels[22])
                        .addComponent(labels[23])
                )
                .addGroup(
                    gl.createSequentialGroup()
                        .addComponent(labels[24])
                        .addComponent(labels[25])
                        .addComponent(labels[26])
                        .addComponent(labels[27])
                        .addComponent(labels[28])
                        .addComponent(labels[29])
                        .addComponent(labels[30])
                        .addComponent(labels[31])
                )
                .addGroup(
                    gl.createSequentialGroup()
                        .addComponent(labels[32])
                        .addComponent(labels[33])
                        .addComponent(labels[34])
                        .addComponent(labels[35])
                        .addComponent(labels[36])
                        .addComponent(labels[37])
                        .addComponent(labels[38])
                        .addComponent(labels[39])
                )
                .addGroup(
                    gl.createSequentialGroup()
                        .addComponent(labels[40])
                        .addComponent(labels[41])
                        .addComponent(labels[42])
                        .addComponent(labels[43])
                        .addComponent(labels[44])
                        .addComponent(labels[45])
                        .addComponent(labels[46])
                        .addComponent(labels[47])
                )
                .addGroup(
                    gl.createSequentialGroup()
                        .addComponent(labels[48])
                        .addComponent(labels[49])
                        .addComponent(labels[50])
                        .addComponent(labels[51])
                        .addComponent(labels[52])
                        .addComponent(labels[53])
                        .addComponent(labels[54])
                        .addComponent(labels[55])
                )
                .addGroup(
                    gl.createSequentialGroup()
                        .addComponent(labels[56])
                        .addComponent(labels[57])
                        .addComponent(labels[58])
                        .addComponent(labels[59])
                        .addComponent(labels[60])
                        .addComponent(labels[61])
                        .addComponent(labels[62])
                        .addComponent(labels[63])
                )
        )

        gl.setVerticalGroup(
            gl.createSequentialGroup()
                .addGroup(
                    gl.createParallelGroup()
                        .addComponent(labels[0])
                        .addComponent(labels[1])
                        .addComponent(labels[2])
                        .addComponent(labels[3])
                        .addComponent(labels[4])
                        .addComponent(labels[5])
                        .addComponent(labels[6])
                        .addComponent(labels[7])
                )
                .addGroup(
                    gl.createParallelGroup()
                        .addComponent(labels[8])
                        .addComponent(labels[9])
                        .addComponent(labels[10])
                        .addComponent(labels[11])
                        .addComponent(labels[12])
                        .addComponent(labels[13])
                        .addComponent(labels[14])
                        .addComponent(labels[15])
                )
                .addGroup(
                    gl.createParallelGroup()
                        .addComponent(labels[16])
                        .addComponent(labels[17])
                        .addComponent(labels[18])
                        .addComponent(labels[19])
                        .addComponent(labels[20])
                        .addComponent(labels[21])
                        .addComponent(labels[22])
                        .addComponent(labels[23])
                )
                .addGroup(
                    gl.createParallelGroup()
                        .addComponent(labels[24])
                        .addComponent(labels[25])
                        .addComponent(labels[26])
                        .addComponent(labels[27])
                        .addComponent(labels[28])
                        .addComponent(labels[29])
                        .addComponent(labels[30])
                        .addComponent(labels[31])
                )
                .addGroup(
                    gl.createParallelGroup()
                        .addComponent(labels[32])
                        .addComponent(labels[33])
                        .addComponent(labels[34])
                        .addComponent(labels[35])
                        .addComponent(labels[36])
                        .addComponent(labels[37])
                        .addComponent(labels[38])
                        .addComponent(labels[39])
                )
                .addGroup(
                    gl.createParallelGroup()
                        .addComponent(labels[40])
                        .addComponent(labels[41])
                        .addComponent(labels[42])
                        .addComponent(labels[43])
                        .addComponent(labels[44])
                        .addComponent(labels[45])
                        .addComponent(labels[46])
                        .addComponent(labels[47])
                )
                .addGroup(
                    gl.createParallelGroup()
                        .addComponent(labels[48])
                        .addComponent(labels[49])
                        .addComponent(labels[50])
                        .addComponent(labels[51])
                        .addComponent(labels[52])
                        .addComponent(labels[53])
                        .addComponent(labels[54])
                        .addComponent(labels[55])
                )
                .addGroup(
                    gl.createParallelGroup()
                        .addComponent(labels[56])
                        .addComponent(labels[57])
                        .addComponent(labels[58])
                        .addComponent(labels[59])
                        .addComponent(labels[60])
                        .addComponent(labels[61])
                        .addComponent(labels[62])
                        .addComponent(labels[63])
                )
        )
        pack()
    }
}