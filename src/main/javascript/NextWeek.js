/*
   Question:
   Implémentez la fonction nextWeek(date) qui renvoie une date 7 jours après la date donnée en paramètre.
date est toujours un objet Date défini.
 */

const nextWeek = (date) =>{
    let dateToReturn = new Date(date)
    dateToReturn.setDate(date.getDate() + 7)
    return dateToReturn;
}