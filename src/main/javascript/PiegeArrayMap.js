/*
La fonction JavaScript qui vous est présentée contient un bug. Votre objectif est de le trouver et de le corriger.
Vous devez implémenter la fonction convertToIntegers() qui prend en paramètre un tableau de strings. Chacune de ces strings représente un entier.
La fonction doit donc les parser et retourner la liste de ces entiers.
Par exemple, convertToIntegers(["4", "7", "12"]) doit retourner [4, 7, 12].
Remarque: Pour avoir le score maximum, vous devez continuez à utiliser la fonction Array.map.
 */

const convertToIntegers = (strings) => {
     return strings.map(e=> Number.parseInt(e));
}
