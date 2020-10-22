L'objectif de ce TP est de voir pas à pas la création d'un projet spring boot web

# Création d'un projet maven :

Dans eclipse, faire File > new > Project > Other
Sélectionner "Maven"
Sélectionner "Maven Project"
Faire Next

Cocher "Create a simple project (skip archetype selection)"

GroupId : com.tp.projetweb
artifact id : demo-web

Faire Finish

## Import de spring boot web dans votre projet

Rajouter le code suivant dans votre pom.xml (avant la balise </project> ) :

```xml
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.3.3.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	
	<properties>
		<java.version>1.8</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
```

## Application 

Dans src/main/java créez un nouveau package nommé démo

A l'intérieur, créer une classe nomé Application avec à l'intérieur :

```java
package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}
}


```

Si Eclipse ne trouve pas les classes de spring boot, faites un clic droit sur votre projet > maven > update maven project puis relancez eclipse

## Premier Controller

Créer un package web au sein de votre package demo, et créer une classe nommé WebController

Vous devez spécifier à votre classe qu'elle doit être géré par Spring en tant que Contoller avec l'annotation `@RestController`
et qu'elle répondra si on fait une requête préfixé par `/demo avec l'annotation `@RequestMapping("/demo")`

Exemple :

```java 
@RestController
@RequestMapping("/demo")
public class WebController {

}
```

(n'oubliez pas les imports)

Créer ensuite une méthode qui renvoie "hello" si on fait un appel HTTP GET. Exemple :

```java

	@GetMapping
	public String hello() {
		return "hello";
	}
```

Avec votre navigateur, testez l'url : http://localhost:8080/demo 

Vous pouvez tester une autre url pour voir ce qu'il se passe



## Génération de la documentation

Dans votre pom.xml ajouter dans la section <dependencies> le code suivant :

```xml
	<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.9.2</version>
		</dependency>

```

Dans votre classe Application ajouter l'annotation : `@EnableSwagger2` :

```java

@SpringBootApplication
@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}
	

}


``` 


N'oubliez pas de couper votre application (carré rouge dans la console), puis faites un clic droit sur votre pom.xml > run as > maven install (pour importer nos nouvelles dépendances)

Vous pouvez relancer votre application et visitez l'url : http://localhost:8080/v2/api-docs

Ajouter la dépendance : 

```xml
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>
``` 

Répétez l'étape d'import des dépendances et relancez votre projet et visitez l'url : http://localhost:8080/swagger-ui.html 


## Ajout de paramètre

Ajouter un paramètre dans votre controler :

```java
@GetMapping
	public String hello(@RequestParam("name") String name) {
		return "hello "+name;
	}

```

et testez via swagger

# TP Fil Rouge

Nous allons maintenant reprendre nos classe de notre TP Fil Rouge dans notre application web.

## Copie

Créer un pacakge nomé "domain"

Recopiez y (et résolvez tout vos problème d'import et de pakage) les classes venant de votre TP fil rouge dans votre classe application web

## API Web

Au sein de votre WebController vous allez instancier une nouvelle caisse (dans le constructeur de voter WebController) , et rajouter les méthodes permetant de :
* activer la caisse
* encaisser
* afficher le montant des opérations

Chacune de ces opérations appelera notre CaisseEnregistreuse

```java
@RestController
@RequestMapping("/demo")
public class WebController {
	
	
	CaisseEnregistreuse caisse;
	
	public WebController() {
		this.caisse = new CaisseEnregistreuse();
	}
	
	@GetMapping("/activation")
	public void activer() {
		caisse.activation();
	}
	
	
	@GetMapping("/encaisser")
	public void encaisser(@RequestParam("name") String product,
			@RequestParam("montant") int montant) {
		Operation operationVente = new OperationVente(montant, product);
		caisse.encaisser(operationVente);
	}
	
	@GetMapping("/montant")
	public int getMontant() {
		return caisse.getMontantTotal();
	}

}

```

## API WEB 2 et Manipulation de tableau

Modifier votre caisse enregistreuse pour avoir une méthode d'annulation de la dernière opération (ce qui veut dire supprimer la dernière opération de votre tableau).

Rajouter une API pour supprimer via votre contollerWeb
