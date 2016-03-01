Q1 : Il est interessant d'utiliser la classe JWindow lorsque l'on ne veut pas que l'utilisateur puisse intéragir avec la fenêtre (la déplacer, la fermer, ...)
La méthode pack, permet d'enlever tout le superflu de la fenêtre. Il est important de l'appeller avant setLocaltionRelativeTo et après setSize, sinon le texte ne seras pas disposé au bon endroit.

Q2 : La taille de la barre de titre varie avec la largeur de la frame et la position du lavel varie avec la hauteur de la frame

Q3 : Lorsque l'on ferme la fenêtre sans avoir fait de setDefaultCloseOperation avant, la frame se ferme correctement mais le programme continue de tourner.

Q5 : Si la boîte de dialogue est modale, il est uniquement possible de déplacer la frame. Sinon on peut tous faire directement sur la frame.

Q6 : Les composant nord et sud ont uniquement leur largeur qui varie avec la largeur de la frame. Les composant ouest et est ont uniquement leur hauteur qui varie avec la hauteur de la frame et le composant centre a sa hauteur et sa largeur qui varie avec la hauteur et la largeur de la frame.

Q7 : Lorsque l'on redimensionne la frame, les boutons restent bien à la position qui leur est défini de base (ex : center) et le nombre de boutons augmentent ou diminue sur une même kligne respectivement si on augmente ou diminue la largeur de la frame.

Q8 : Lorsque l'on redimensionne la frame, la position des boutons n'évoluent pas, par contre leur largeur et leur hauteur augmente ou diminue en fonction de l'augmentation ou de la diminution de la taille de la frame.


