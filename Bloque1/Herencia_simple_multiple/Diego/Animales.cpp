#include <iostream>
using namespace std;

class Animal {
public:
    string nombre;

    Animal(string nombre) : nombre(nombre) {
        cout << "Animal constructor" << endl;
    }

    virtual void andar() {
        cout << nombre << " está andando" << endl;
    }
};

class Perro : public Animal {
public:
    Perro(string nombre) : Animal(nombre) {}

    void ladrar() {
        cout << nombre << " está ladrando" << endl;
    }

    void andar() {
        cout << nombre << " está corriendo" << endl;
    }
};

class Volador : virtual public Animal {
public:
    Volador(string nombre) : Animal(nombre) {}

    void volar()
    {
        cout << nombre << " está volando" << endl;
    }
};

class Nadador : virtual public Animal {
public:
    Nadador(string nombre) : Animal(nombre) {}

    void andar() {
        cout << nombre << " está nadando" << endl;
    }
};

class Pato : public Volador, public Nadador {
public:
    Pato(string nombre): Animal(nombre), Volador(nombre), Nadador(nombre) {}

    void graznar() {
        cout << nombre << " está graznando" << endl;
    }
};

int main() {
    Perro perro("Pako");
    perro.andar();
    perro.ladrar();


    Pato pato("Justin");
    pato.andar();
    pato.volar();
    pato.graznar();

    Volador volador("Vane");
    volador.volar();

    Nadador nadador("Nando");
    nadador.andar();

    return 0;
}