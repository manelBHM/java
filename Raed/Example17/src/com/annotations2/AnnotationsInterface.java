package com.annotations2;

/*Les custom Annotations sont crées avec @interface,suivie de annotation_Name .
Les annotations peuvent avoir des paramètres (ça ressemble à des méthodes)→ voir l’exemple ci dessous, avec 4 elements qui ne seront pas implémentés.
Toutes les annotations héritent de la classe java.lang.annotation.* interface. Les Annotations n’intègrent jamais d’extends clause.

*/


/*
@Documented :@Documented annotation indicates that elements
using this annotation should be documented by JavaDoc.
@Target :It specifies where we can use the annotation,
ElementType.METHOD,ElementType.PACKAGE,ElementType.PARAMETER,
,ElementType.TYPE,ElementType.ANNOTATION_TYPE,ElementType.CONS
TRUCTOR,ElementType.LOCAL_VARIABLE,ElementType.FIEL
@Inherited : The @Inherited annotation signals that a custom annotation
used in a class should be inherited by all of its sub classes.
@Retention : It indicates how long annotations with the annotated type are to
be retained :
RetentionPolicy.RUNTIME,RetentionPolicy.CLASS,RetentionPolicy.SOURCE:*/




import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Inherited
@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationsInterface {
	
	int age() default 20;	
	String lastName();
	String firstName();
	
	
	
	
	
	
	
	
	
	
	
	

}
