# Java_Interfaces_TP

Projet Java contenant deux exercices sur les interfaces, le polymorphisme et les tableaux dynamiques.

## Structure

```text
Java_Interfaces_TP/
├── src/
│   ├── exercice1/
│   │   ├── PaymentMethod.java
│   │   ├── CreditCard.java
│   │   ├── PayPal.java
│   │   ├── Bitcoin.java
│   │   ├── PaymentProcessor.java
│   │   └── Main.java
│   └── exercice2/
│       ├── Notification.java
│       ├── EmailNotification.java
│       ├── SMSNotification.java
│       ├── PushNotification.java
│       ├── NotificationManager.java
│       └── Main.java
├── .project
├── .classpath
└── README.md
```

## Ouvrir dans Eclipse

1. Décompressez le ZIP.
2. Dans Eclipse, choisissez **File > Import... > General > Existing Projects into Workspace**.
3. Sélectionnez **Select root directory**, puis le dossier `Java_Interfaces_TP` décompressé.
4. Cochez le projet et cliquez sur **Finish**.
5. Pour lancer l'exercice 1 : clic droit sur `src/exercice1/Main.java` > **Run As > Java Application**.
6. Pour lancer l'exercice 2 : clic droit sur `src/exercice2/Main.java` > **Run As > Java Application**.

Si Eclipse affiche une erreur de JRE : clic droit sur le projet > **Properties > Java Build Path > Libraries**, puis sélectionnez un JDK installé (JDK 8 ou supérieur).

## Compiler depuis un terminal

Depuis le dossier du projet :

```bash
javac -d bin src/exercice1/*.java src/exercice2/*.java
java -cp bin exercice1.Main
java -cp bin exercice2.Main
```

## Mettre sur GitHub

Créez un dépôt GitHub vide, puis ouvrez un terminal dans le dossier du projet :

```bash
git init
git add .
git commit -m "Ajout des exercices Java sur les interfaces"
git branch -M main
git remote add origin https://github.com/VOTRE-NOM/Java_Interfaces_TP.git
git push -u origin main
```

Remplacez l'URL d'exemple par l'URL de votre dépôt GitHub. Ne mettez pas le dossier `bin/` sur GitHub : il est ignoré par `.gitignore`.
