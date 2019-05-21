autor(susan_collins).
autor(andres_Oppenheimer).
autor(isaac_Asimov).
autor(stephen_king).
autor(george_R_R_Martin).
autor(cj_daugherty).
autor(jk_rowling).
autor(antonio_malpica).

libro(adonde_no_conozco_nada).
libro(ulises2300).
libro(it).
libro(the_hunger_games).
libro(sinsajo).
libro(salvese_quien_pueda).
libro(the_bicentenal_man).
libro(cancion_de_fuego).
libro(cimmeria).
libro(harry_potter).

genero(terror).
genero(ciencia_ficcion).
genero(ficcion).
genero(drama).
genero(informativa).
genero(fantasia).
genero(novela).

fecha(2011).
fecha(2012).
fecha(2003).
fecha(1986).
fecha(1996).
fecha(1976).
fecha(2008).
fecha(2010).
fecha(1997).
fecha(2018).

editorial(alas_y_raices).
editorial(sm_de_ediciones).
editorial(viking_press).
editorial(bantam_books).
editorial(scholastic_corporation).
editorial(debate).
editorial(salamandra).
editorial(alfaguara_infantiles_y_juveniles).




libroGenero(adonde_no_conozco_nada, ficcion).
libroGenero(ulises2300,ficcion).
libroGenero(it, terror).
libroGenero(it, fantasia).
libroGenero(the_hunger_games,ciencia_ficcion ).
libroGenero(sinsajo, ciencia_ficcion).
libroGenero(the_bicentenal_man, ciencia_ficcion ).
libroGenero(salvese_quien_pueda, informativa).
libroGenero(cancion_de_fuego,fantasia).
libroGenero(cancion_de_fuego,novela).
libroGenero(cimmeria,ficcion ).
libroGenero(harry_potter, drama).
libroGenero(harry_potter, ficcion).

autorDe(antonio_malpica, adonde_no_conozco_nada).
autorDe(antonio_malpica, ulises2300).
autorDe(stephen_king,it).
autorDe(george_R_R_Martin, cancion_de_fuego).
autorDe(susan_collins, the_hunger_games).
autorDe(andres_Oppenheimer, salvese_quien_pueda).
autorDe(susan_collins, sinsajo).
autorDe(cj_daugherty, cimmeria).
autorDe(isaac_asimov, the_bicentenal_man).
autorDe(jk_rowling, harry_potter).


editorialDe(adonde_no_conozco_nada,alas_y_raices).
editorialDe(ulises2300,sm_de_ediciones).
editorialDe(it,viking_press).
editorialDe(cancion_de_fuego,bantam_books).
editorialDe(the_hunger_games,scholastic_corporation).
editorialDe(sinsajo,scholastic_corporation).
editorialDe(harry_potter,salamandra).
editorialDe(salvese_quien_pueda, debate).   
editorialDe(the_bicentenal_man, ballantine_books).
editorialDe(cimmeria, alfaguara_infantiles_y_juveniles).

fechaPublicacion(adonde_no_conozco_nada,2011).
fechaPublicacion(ulises2300,2003).
fechaPublicacion(it,1986).
fechaPublicacion(cancion_de_fuego, 1996).
fechaPublicacion(the_bicentenal_man, 1976).
fechaPublicacion(the_hunger_games,2008).
fechaPublicacion(sinsajo,2010).
fechaPublicacion(harry_potter,1997).
fechaPublicacion(salvese_quien_pueda, 2018).
fechaPublicacion(cimmeria, 2012).


titleInformation(X) :-
	libroGenero(X, Genero),
	format("Genero: ~w", [Genero]), nl,
	autorDe(Autor, X),
	format("El autor es: ~w", [Autor]), nl,
	fechaPublicacion(X, Publicacion),
	format("año de publicacion: ~w", [Publicacion]), nl,
	editorialDe(X,Editorial),
	format("Genero: ~w", [Editorial]), nl,
	!.


editorialInformation(X):-
editorialDe(Libro, X),
format("libros de esa editorial: ~w", [Libro]), nl,
!.

yearInformation(X):-
fechaPublicacion(Autores,X),
format("libro publicado en ese año: ~w", [Autores]), nl,
!.
