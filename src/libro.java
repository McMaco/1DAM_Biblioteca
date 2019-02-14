/***CLASE LIBRO
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 13/02/2019
 * CURSO: DM1B
 */

public class libro {
	
	public static int numlibros=0;
		
	//ATRIBUTOS
	private String titulo;
	private String subtitulo;
	private String autor;
	private String autores;
	private String editorial;
	private int año_edicion;
	private String ISBN;
	private String categoria;
	private String idioma;
	private String codigo;
	private String estado;
	private String fecha_prestamo;
	
	/*CONSTRUCTOR
	 * Entrada--> Este método recibe una serie de variables del main.
	 * Utiliza las variables que recibe para igualar los atributos a ellas y crear el nuevo objeto "libro" con esos valores.
	 */
	libro(String tit, String subtit, String aut, String auts, String edit, int a_ed, String isbn, String cat, String idi, String cod, String est, String f_prest){
		titulo=tit;
		subtitulo=subtit;
		autor=aut;
		autores=auts;
		editorial=edit;
		año_edicion=a_ed;
		ISBN=isbn;
		categoria=cat;
		idioma=idi;
		codigo=cod;
		estado=est;
		fecha_prestamo=f_prest;
		numlibros++;
	}
	
	/*METODOS GETTERS
	 * Cada uno de estos metodos getters se encarga de devolver el valor de los atributos del objeto correspondientes al metodo.
	 */
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getSubtitulo() {
		return this.subtitulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public String getAutores() {
		return this.autores;
	}
	
	public String getEditorial() {
		return this.editorial;
	}
	
	public int getAño_edicion() {
		return this.año_edicion;
	}
	
	public String getISBN() {
		return this.ISBN;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public String getIdioma() {
		return this.idioma;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public String getFecha_prestamo() {
		return this.fecha_prestamo;
	}
	
	
	/*METODOS SETTERS
	 * Cada uno de estos métodos se encarga de modificar los atributos del objeto libro que se ha creado en el constructor
	 */
	public libro setTitulo(String tit) {
		this.titulo=tit;
		return this;
	}
	
	public libro setSubtitulo(String subtit) {
		this.subtitulo=subtit;
		return this;
	}
	
	public libro setAutor(String aut) {
		this.autor=aut;
		return this;
	}
	
	public libro setAutores(String auts) {
		this.autores=auts;
		return this;
	}
	
	public libro setEditorial(String edit) {
		this.editorial=edit;
		return this;
	}
	
	public libro setAño_edicion(int a_ed) {
		this.año_edicion=a_ed;
		return this;
	}
	
	public libro setISBN(String isbn) {
		this.ISBN=isbn;
		return this;
	}
	
	public libro setCategoria(String cat) {
		this.categoria=cat;
		return this;
	}
	
	public libro setIdioma(String idi) {
		this.idioma=idi;
		return this;
	}
	
	public libro setCodigo(String cod) {
		this.codigo=cod;
		return this;
	}
	
	public libro setEstado(String est) {
		this.estado=est;
		return this;
	}
	
	public libro setFecha_prestamo(String f_prest) {
		this.fecha_prestamo=f_prest;
		return this;
	}
	
	/*METODO: Eliminar
	 * Se encarga de comprobar si existe algún libro y si existe eliminarlo en cuanto se le llame.
	 */
	public static void eliminar() {
		if (numlibros>0) numlibros--;		
	}
}