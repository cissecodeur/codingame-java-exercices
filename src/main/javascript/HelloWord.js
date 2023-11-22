/*
Implémentez la fonction solution telle que l'exécution de la ligne suivante : print(solution('Hello you !'));
Donne la sortie suivante (un mot par ligne avec \n ) :
Hello
you
!
Le paramètre d'entrée est toujours une chaîne de caractères non null .

 */

const HelloWord = (text) => {
        return text.split(' ').join('\n');
}