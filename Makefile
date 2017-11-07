
JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
		Bleu.java \
		Rouge.java \
		Vert.java \
		Couleur.java \
		ControllerMouse.java \
		Frame.java \
		Lire.java \
		Main.java \
		ControllerMouse.java \
		ControllerMouseMenu.java \
		ControllerMouseMenuFin.java \
		Fond.java \
		Menu.java \
		MenuFin.java \
		Score.java

default: classes

test:
	java Main

classes: $(CLASSES:.java=.class)

clean:
	rm *.class
