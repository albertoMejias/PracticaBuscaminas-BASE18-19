import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que implementa el listener de los botones del Buscaminas. De alguna
 * manera tendrá que poder acceder a la ventana principal. Se puede lograr
 * pasando en el constructor la referencia a la ventana. Recuerda que desde la
 * ventana, se puede acceder a la variable de tipo ControlJuego
 * 
 * @author Alberto Mejias
 **
 */
public class ActionBoton implements ActionListener {
	private VentanaPrincipal ventanaPrincipal;
	private int i;
	private int j;

	public ActionBoton(VentanaPrincipal ventanaPrincipal, int i, int j) {
		super();
		this.ventanaPrincipal = ventanaPrincipal;
		this.i = i;
		this.j = j;
	}

	/**
	 * Acción que ocurrirá cuando pulsamos uno de los botones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		ventanaPrincipal.mostrarNumMinasAlrededor(i, j);

	}

}
