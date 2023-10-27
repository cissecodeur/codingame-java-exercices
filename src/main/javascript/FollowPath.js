function followPath(gridMap) {
    const width = 15;
    const height = 10;
    let x = 0;
    let y = 0;
    let dx = 1; // Déplacement initial vers la droite
    let dy = 0;
    let result = '';

    while (true) {
        const currentChar = gridMap[y][x];

        if (currentChar !== '*') {
            result += currentChar;
        }

        // Mise à jour des coordonnées en fonction de la direction
        x += dx;
        y += dy;

        if (x < 0 || x >= width || y < 0 || y >= height || currentChar === '*') {
            // Revenir en arrière d'une étape pour corriger la sortie du caractère
            x -= dx;
            y -= dy;

            // Changer la direction (sens horaire : droite -> bas -> gauche -> haut)
            const temp = dx;
            dx = -dy;
            dy = temp;
        }

        // Si le parcours est terminé, sortir de la boucle
        if (x === 0 && y === 0) {
            break;
        }
    }

    return result;
}
