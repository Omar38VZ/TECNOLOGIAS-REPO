// SRP aplicado: cada clase tiene una sola responsabilidad.

type Plan = "basico" | "normal" | "chipocludo";

class User {
    constructor(
        private nombre: string,
        private email: string,
        private edad: number,
        private plan: Plan
    ) { }

    getNombre(): string {
        return this.nombre;
    }

    getEmail(): string {
        return this.email;
    }

    getEdad(): number {
        return this.edad;
    }

    getPlan(): Plan {
        return this.plan;
    }
}

class Validador {

    validarUsuario(user: User): boolean {
        if (user.getNombre().length < 3) {
            console.log(`Nombre ${user.getNombre()} es demasiado corto`);
            return false;
        }

        if (user.getEdad() < 16) {
            console.log("Debes ser mayor de 16 para entrar");
            return false;
        }

        if (!user.getEmail().includes('@')) {
            console.log(`El email ${user.getEmail()} no es valido`);
            return false;
        }

        return true;
    }

}

class Facturadora {

    calcularPrecio(user: User): number {
        const precios: Record<Plan, number> = { "basico": 300, "normal": 550, "chipocludo": 999 };
        const precio: number = precios[user.getPlan()];
        return precio;
    }

    generarFactura(user: User): string {
        const folio: string = `Club Deportivo - ${new Date().toLocaleDateString()}`;
        const factura: string = `${folio}\n Cliente ${user.getNombre()} | Plan ${user.getPlan()} | Total ${this.calcularPrecio(user)}`;
        return factura;
    }

}

class ServicioCorreo {

    mandarEmailBienvenida(user: User): void {
        console.log(`Email enviado al correo ${user.getEmail()}`);
        console.log(`Bienvenido ${user.getNombre()}\n`);
    }
}

const validador = new Validador();
const facturadora = new Facturadora();
const correo = new ServicioCorreo();

const usuarios: User[] = [
    new User("Omar", "omar@correo.com", 20, "chipocludo"),
    new User("Ana", "ana-correo.com", 22, "basico"),
    new User("Luis", "luis@correo.com", 14, "normal")
];

for (const user of usuarios) {
    if (validador.validarUsuario(user)) {
        console.log(facturadora.generarFactura(user));
        correo.mandarEmailBienvenida(user);
    }
}

export {};
