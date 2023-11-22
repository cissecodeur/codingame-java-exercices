/*
Implémentez la fonction helloProperties(obj) .
Cette fonction prend en paramètre un objet obj comme celui-ci:

{
    john: 12,
    brian: true,
    doe: 'hi',
    fred: false
}
Et renvoie une array contenant ses noms de propriétés, préfixés par "Hello-", comme ceci:
obj est toujours défini et est toujours un objet JavaScript
 ['Hello-john', 'Hello-brian', 'Hello-doe', 'Hello-fred'];
 */

const helloProperties = (obj) => {
        const keys = Object.keys(obj);
        const arrayToReturn = [];
        for(let key of keys){
            arrayToReturn.push(`Hello-${key}`)
        }

        return arrayToReturn;
}