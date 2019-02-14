/***CLASE DE EJECUCION PARA EL PROYECTO BIBLIOTECA
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 13/02/2019
 * CURSO: DM1B
 */

import java.util.Scanner;

public class biblioteca {
	
	public static libro libros[] = new libro[1000];
	
	public static void main(String [] args) {
		
		String guion="-", bbdd=null, tit=null, tit1=null, subtit=null, aut=null, auts=null, edit=null, isbn=null, cat=null, idi=null, cod=null, est=null, f_prest=null;
		int opc=0, opc1=0, a_ed = 0, d_prest=0, m_prest=0, a_prest=0, i=0;
		Scanner t = new Scanner(System.in);
		
		libro uno = null;
		
		System.out.print("Introduzca el nombre de la base de datos con la que quiere trabajar: ");
		bbdd = t.next();
		System.out.println();
		
		do {
			try {
				System.out.println("----------");
				System.out.println("BIBLIOTECA");
				System.out.println("----------");
				System.out.println("0.- SALIR");
				System.out.println("1.- PRESTAR");
				System.out.println("2.- DEVOLVER");
				System.out.println("3.- AÑADIR");
				System.out.println("4.- ELIMINAR");
				System.out.println("5.- MOSTRAR NUMERO DE LIBROS");
				System.out.println();
				System.out.print("Introduzca una opción del menú:");
				opc = t.nextInt();
			}
			
			catch(Exception e) {
				t.next();
				opc = 6;
			}
			
			switch(opc)	{ 
			
			case 0://SALIR 
				
				System.out.print("                               ");
				System.out.println("--------------------------------");
				System.out.print("                               ");
				System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA");
				System.out.print("                               ");
				System.out.println("  ESPERO QUE HAYAS APRENDIDO");
				System.out.print("                               ");
				System.out.println("--------------------------------");
				
			break;
			
			case 1://PRESTAR
				do {
					try {
						System.out.println("-------");
						System.out.println("PRESTAR");
						System.out.println("-------");
						System.out.println("1.- BUSCAR POR TITULO");
						System.out.println("2.- BUSCAR POR AUTOR");
						System.out.println("3.- BUSCAR POR ISBN");
						System.out.println("4.- VOLVER");
						System.out.println();
						System.out.print("Introduzca una opción del menú: ");
						opc = t.nextInt();
					}
					
					catch(Exception e) {
						t.next();
						opc = 0;
					}
					
					switch(opc) {
					
					case 1://BUSCAR POR TITULO 
						System.out.println("-----------------");
						System.out.println("BUSCAR POR TITULO");
						System.out.println("------------------");
						do {
							try {
								System.out.print("Título: ");
								tit = t.nextLine();
							}
							catch(Exception e) {
								tit = "a";
							}
							tit = tit.toUpperCase();
						}while (tit.matches(".*[^A-Z- ].*"));
						
						for(i=0; i<=libro.numlibros; i++) {
							try {
								if(libros[i].getTitulo().equals(tit)) {
									System.out.println("----------------");
									System.out.println("LIBRO ENCONTRADO");
									System.out.println("----------------");
									System.out.println();
									System.out.println("Titulo: "+ libros[i].getTitulo());
									System.out.println("Subtitulo: "+ libros[i].getSubtitulo());
									System.out.println("Autor: "+ libros[i].getAutor());
									System.out.println("Autores: " + libros[i].getAutores());
									System.out.println("Editorial: "+ libros[i].getEditorial());
									System.out.println("Año de edicion: "+ libros[i].getAño_edicion());
									System.out.println("ISBN: "+ libros[i].getISBN());
									System.out.println("Categoria: "+ libros[i].getCategoria());
									System.out.println("Idioma: "+ libros[i].getIdioma());
									System.out.println("Código: "+ libros[i].getCodigo());
									System.out.println("Estado: "+ libros[i].getEstado());
									System.out.println("Fecha prestamo: "+ libros[i].getFecha_prestamo());
									System.out.println();
									do {
										try {
											System.out.println("¿Desea prestar este libro?");
											System.out.println("1.- SI");
											System.out.println("2.- NO");
											opc1 = t.nextInt();
										}
										catch(Exception e) {
											t.next();
											opc1=0;
										}
									}while((opc1<1)||(opc1>2));
									
									if(opc1==1) {
										est = "PRESTADO";
										libros[i].setEstado(est);
									}
								}
							}
							catch(Exception e) {
								
							}
						}
					break;
					
					case 2://BUSCAR POR AUTOR
						System.out.println("----------------");
						System.out.println("BUSCAR POR AUTOR");
						System.out.println("----------------");
						do {
							try {
								System.out.print("Autor: ");
								aut = t.nextLine();
							}
							catch(Exception e) {
								aut = "a";
							}
							aut = aut.toUpperCase();
						}while (aut.matches(".*[^A-Z- ].*"));
						
						for(i=0; i<=libro.numlibros; i++) {
							try {
								if(libros[i].getAutor().equals(aut)) {
									System.out.println("----------------");
									System.out.println("LIBRO ENCONTRADO");
									System.out.println("----------------");
									System.out.println();
									System.out.println("Titulo: "+ libros[i].getTitulo());
									System.out.println("Subtitulo: "+ libros[i].getSubtitulo());
									System.out.println("Autor: "+ libros[i].getAutor());
									System.out.println("Autores: " + libros[i].getAutores());
									System.out.println("Editorial: "+ libros[i].getEditorial());
									System.out.println("Año de edicion: "+ libros[i].getAño_edicion());
									System.out.println("ISBN: "+ libros[i].getISBN());
									System.out.println("Categoria: "+ libros[i].getCategoria());
									System.out.println("Idioma: "+ libros[i].getIdioma());
									System.out.println("Código: "+ libros[i].getCodigo());
									System.out.println("Estado: "+ libros[i].getEstado());
									System.out.println("Fecha prestamo: "+ libros[i].getFecha_prestamo());
									System.out.println();
									do {
										try {
											System.out.println("¿Desea prestar este libro?");
											System.out.println("1.- SI");
											System.out.println("2.- NO");
											opc1 = t.nextInt();
										}
										catch(Exception e) {
											t.next();
											opc1=0;
										}
									}while((opc1<1)||(opc1>2));
									
									if(opc1==1) {
										est = "PRESTADO";
										libros[i].setEstado(est);
									}
								}
							}
							catch(Exception e) {
								
							}
						}
					break; 
					
					case 3://BUSCAR POR ISBN 
						System.out.println("---------------");
						System.out.println("BUSCAR POR ISBN");
						System.out.println("---------------");
						do {
							try {
								System.out.print("ISBN: ");
								isbn = t.nextLine();
							}
							catch(Exception e) {
								isbn = "a";
							}
							isbn = isbn.toUpperCase();
						}while (isbn.matches(".*[^A-Z- ].*"));
						
						for(i=0; i<=libro.numlibros; i++) {
							try {
								if(libros[i].getISBN().equals(isbn)) {
									System.out.println("----------------");
									System.out.println("LIBRO ENCONTRADO");
									System.out.println("----------------");
									System.out.println();
									System.out.println("Titulo: "+ libros[i].getTitulo());
									System.out.println("Subtitulo: "+ libros[i].getSubtitulo());
									System.out.println("Autor: "+ libros[i].getAutor());
									System.out.println("Autores: " + libros[i].getAutores());
									System.out.println("Editorial: "+ libros[i].getEditorial());
									System.out.println("Año de edicion: "+ libros[i].getAño_edicion());
									System.out.println("ISBN: "+ libros[i].getISBN());
									System.out.println("Categoria: "+ libros[i].getCategoria());
									System.out.println("Idioma: "+ libros[i].getIdioma());
									System.out.println("Código: "+ libros[i].getCodigo());
									System.out.println("Estado: "+ libros[i].getEstado());
									System.out.println("Fecha prestamo: "+ libros[i].getFecha_prestamo());
									System.out.println();
									do {
										try {
											System.out.println("¿Desea prestar este libro?");
											System.out.println("1.- SI");
											System.out.println("2.- NO");
											opc1 = t.nextInt();
										}
										catch(Exception e) {
											t.next();
											opc1=0;
										}
									}while((opc1<1)||(opc1>2));
									
									if(opc1==1) {
										est = "PRESTADO";
										libros[i].setEstado(est);
									}
								}
							}
							catch(Exception e) {
								
							}
						}
					break;
					
					case 4://VOLVER
						System.out.println("Volviendo...");
					break;
					
					default:
						System.out.println("Opcion incorrecta");
					break;
					}
				}while(opc!=4);
				
			break;
			
			case 2://DEVOLVER
				
			break;
			
			case 3://AÑADIR
				System.out.println("------");
				System.out.println("AÑADIR");
				System.out.println("------");
				t.nextLine();
				do {
					try {
						System.out.print("Título: ");
						tit = t.nextLine();
					}
					catch(Exception e) {
						tit = "a";
					}
					tit = tit.toUpperCase();
				}while (tit.matches(".*[^A-Z- ].*"));
				
				do {
					try {
						System.out.print("Subtítulo: ");
						subtit = t.nextLine();
					}
					catch(Exception e) {
						subtit = "a";
					}
					subtit = subtit.toUpperCase();
				}while (subtit.matches(".*[^A-Z- ].*"));
				
				do {
					try {
						System.out.print("Autor: ");
						aut = t.nextLine();
					}
					catch(Exception e) {
						aut = "a";
					}
					aut = aut.toUpperCase();
				}while (aut.matches(".*[^A-Z- ].*"));
				
				do {
					try {
						System.out.print("Autores: ");
						auts = t.nextLine();
					}
					catch(Exception e) {
						auts = "a";
					}
					auts = auts.toUpperCase();
				}while (auts.matches(".*[^A-Z- ].*"));
				
				do {
					try {
						System.out.print("Editorial: ");
						edit = t.nextLine();
					}
					catch(Exception e) {
						edit = "a";
					}
					edit = edit.toUpperCase();
				}while (edit.matches(".*[^A-Z- ].*"));
				
				do {
					try {
						System.out.print("Año de edición: ");
						a_ed = t.nextInt();
					}
					catch(Exception e) {
						t.next();
					}
				}while (a_ed>2019);
				
				do {
					try {
						System.out.print("ISBN: ");
						isbn = t.next();
					}
					catch(Exception e) {
						isbn = "a";
					}
					isbn = isbn.toUpperCase();
				}while ((isbn.length() < 4)||(isbn.length()>12));
				
				do {
					try {
						System.out.print("Categoría: ");
						cat = t.next();
					}
					catch(Exception e) {
						cat = "a";
					}
					cat = cat.toUpperCase();
				}while ((cat.length()<2)||(cat.length()>15)||(cat.matches(".*[^A-Z- ].*")));
				
				char v[] = cat.toCharArray();
				char p[] = aut.toCharArray();
				
				String one = Character.toString(v[0]);
				String two = Character.toString(v[1]);
				String three = Character.toString(v[2]);
				String four = Character.toString(p[0]);
				four = four.toLowerCase();
				String five = Character.toString(p[1]);
				five = five.toLowerCase();
				String six = Character.toString(p[2]);
				six = six.toLowerCase();
				
				cod = one + two + three + four + five + six + (libro.numlibros+1);
				
				do {
					try {
						System.out.print("Idioma: ");
						idi = t.next();
					}
					catch(Exception e) {
						idi = "a";
					}
					idi = idi.toUpperCase();
				}while ((idi.length()<2)||(idi.length()>15)||(idi.matches(".*[^A-Z- ].*")));
				
				do {
					try {
						System.out.print("Estado (Biblioteca / Prestado / Vencido): ");
						est = t.next();
					}
					catch(Exception e) {
						est = "a";
					}
					est = est.toUpperCase();
				}while ((est.length()<2)||(est.length()>15)||(est.matches(".*[^A-Z- ].*")));
				
				do {
					try {
						System.out.print("Día de la fecha prestamo: ");
						d_prest = t.nextInt();
					}
					catch(Exception e) {
						t.next();
					}
				}while ((d_prest<0)||(d_prest>31));
				
				do {
					try {
						System.out.print("Mes de la fecha prestamo: ");
						m_prest = t.nextInt();
						if ((d_prest > 29) && (m_prest == 2))	m_prest = 0;
						if ((d_prest > 30) && ((m_prest == 4) || (m_prest == 6) || (m_prest == 9) || (m_prest == 11)))
						m_prest = 0;
					
					}
					catch(Exception e) {
						t.next();
					}
				}while ((m_prest < 1) || (m_prest > 12));
				
				do {
					try {
						System.out.print("Año de la fecha prestamo: ");
						a_prest = t.nextInt();
					}
					catch(Exception e) {
						t.next();
					}
				}while ((a_prest<0)||(a_prest>2019));
				
				f_prest = d_prest + guion + m_prest + guion + a_prest;
				
				uno = new libro(tit, subtit, aut, auts, edit, a_ed, isbn, cat, idi, cod, est, f_prest);
				libros[(libro.numlibros)-1] = new libro(tit, subtit, aut, auts, edit, a_ed, isbn, cat, idi, cod, est, f_prest);
				
				System.out.println();
				
				System.out.println("--------------------------");
				System.out.println("LIBRO CREADO CORRECTAMENTE");
				System.out.println("--------------------------");
				System.out.println();
				System.out.println("Titulo: "+ tit);
				System.out.println("Subtitulo: "+ subtit);
				System.out.println("Autor: "+ aut);
				System.out.println("Autores: " + auts);
				System.out.println("Editorial: "+ edit);
				System.out.println("Año de edicion: "+ a_ed);
				System.out.println("ISBN: "+ isbn);
				System.out.println("Categoria: "+ cat);
				System.out.println("Idioma: "+ idi);
				System.out.println("Código: "+ cod);
				System.out.println("Estado: "+ est);
				System.out.println("Fecha prestamo: "+ f_prest);
				
			break;
			
			case 4://ELIMINAR
				
			break;
			
			case 5://MOSTRAR NUMERO DE LIBROS 
				
			break;
				
			default:
				
				System.out.println("Opción incorrecta");
				
			break;
			}
		
		}while(opc!=0);
	}
}