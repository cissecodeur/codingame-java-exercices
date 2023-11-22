/*
Inplémentez la fonction average(table) .
La fonction doit renvoyer la valeur moyenne du tableau table donné en paramètre. table est
toujours un tableau défini, et ne contient que des nombres. average doit retourner 0 si table est vide.
 */

const average = (table)  => {
  return  table.length === 0 ? 0 : table.reduce((a,b) => a+b)/table.length;
}
