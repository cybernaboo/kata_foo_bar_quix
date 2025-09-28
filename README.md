# Projet Kata

> Projet de démonstration pour Spring Boot

Ce projet contient une application Spring Boot avec deux fonctionnalités principales :
1.  Un service web RESTful pour convertir des nombres en chaînes de caractères selon des règles métier spécifiques.
2.  Un processeur de traitement par lots (batch) autonome.

## Prérequis

*   Java 17 ou une version supérieure.

## Scripts de Lancement

Des scripts sont fournis pour faciliter le lancement des applications sur différents systèmes d'exploitation.

*   `restLauncherMac.sh`: Lance le service web sur macOS ou Linux.
*   `restLauncherWin.sh`: Lance le service web sur Windows.
*   `batchRunnerMac.sh`: Exécute le traitement batch sur macOS ou Linux.
*   `batchRunnerWin.sh`: Exécute le traitement batch sur Windows.

## Application Web

### Lancement de l'application

Pour démarrer le serveur web, exécutez la commande suivante. Le script correspondant peut aussi être utilisé.

**Sur Windows :**
```bash
.\mvnw.cmd spring-boot:run
```

**Sur macOS/Linux :**
```bash
./mvnw spring-boot:run
```

Le serveur démarrera sur le port configuré dans `src/main/resources/application.properties` (par défaut 8080).

### Point de Terminaison (Endpoint)

*   #### `GET /numbertostring`

    Convertit un nombre entier donné en sa représentation textuelle en suivant un ensemble de règles.

    **Paramètre de requête :**
    *   `inputvalue` (String) : L'entier à convertir.

    **Règles de conversion :**

    Le service applique les règles suivantes dans l'ordre :
    1.  Si le nombre est divisible par 3, le résultat contiendra "FOO".
    2.  Si le nombre est divisible par 5, le résultat contiendra "BAR".
    3.  Ensuite, chaque chiffre du nombre est examiné :
        *   Pour chaque '3', "FOO" est ajouté au résultat.
        *   Pour chaque '5', "BAR" est ajouté au résultat.
        *   Pour chaque '7', "QUIX" est ajouté au résultat.
    4.  Si aucune des règles ci-dessus ne s'applique, le service retourne le nombre original sous forme de chaîne de caractères.

    **Exemples :**
    *   `1` => `"1"`
    *   `3` => `"FOOFOO"` (divisible par 3, contient un 3)
    *   `5` => `"BARBAR"` (divisible par 5, contient un 5)
    *   `15` => `"FOOBARBAR"` (divisible par 3, divisible par 5, contient un 5)
    *   `51` => `"FOOBAR"` (divisible par 3, contient un 5)
    *   `53` => `"BARFOO"` (divisible par aucun, contient un 5, contient un 3)

    **Exemple d'appel :**
    ```
    curl "http://localhost:8080/numbertostring?inputvalue=15"
    ```

## Application Batch

### Lancement du traitement batch

Le projet inclut un traitement par lots qui applique les mêmes règles de conversion à chaque ligne d'un fichier d'entrée.

Pour lancer le traitement, utilisez la commande suivante ou le script approprié. N'oubliez pas d'ajouter `compile` pour vous assurer que le code le plus récent est utilisé.

**Sur Windows :**
```bash
.\mvnw.cmd compile exec:java "-Dexec.args=inputfile.txt outputfile.txt errorfile.txt"
```

**Sur macOS/Linux :**
```bash
./mvnw compile exec:java "-Dexec.args=inputfile.txt outputfile.txt errorfile.txt"
```

**Arguments :**

1.  `inputfile.txt`: Le chemin vers le fichier d'entrée.
2.  `outputfile.txt`: Le chemin où le fichier de sortie sera créé.
3.  `errorfile.txt`: Le chemin où le fichier d'erreur sera créé en cas de problème.

## Exécution des Tests

Pour exécuter les tests unitaires du projet, lancez :

**Sur Windows :**
```bash
.\mvnw.cmd test
```

**Sur macOS/Linux :**
```bash
./mvnw test
```
