// SRP NO aplicado: una sola clase valida, factura y manda correos.
// Tiene tres razones para cambiar.

type Plan = "basico" | "normal" | "chipocludo";

class User {
    constructor(
        private nombre: string,
        private email: string,
        private edad: number,
        private plan: Plan
    ) { }

    validarUsuario(): boolean {
        if (this.nombre.length < 3) {
            console.log(`Nombre ${this.nombre} es demasiado corto`);
            return false;
        }

        if (this.edad < 16) {
            console.log("Debes ser mayor de 16 para entrar");
            return false;
        }

        if (!this.email.includes('@')) {
            console.log(`El email ${this.email} no es valido`);
            return false;
        }

        return true;
    }

    calcularPrecio(): number {
        const precios: Record<Plan, number> = { "basico": 300, "normal": 550, "chipocludo": 999 };
        return precios[this.plan];
    }

    generarFactura(): string {
        const folio: string = `Club Deportivo - ${new Date().toLocaleDateString()}`;
        return `${folio}\n Cliente ${this.nombre} | Plan ${this.plan} | Total ${this.calcularPrecio()}`;
    }

    mandarEmailBienvenida(): void {
        console.log(`Email enviado al correo ${this.email}`);
        console.log(`Bienvenido ${this.nombre}\n`);
    }
}

const user = new User("Omar", "omar@correo.com", 20, "chipocludo");

if (user.validarUsuario()) {
    console.log(user.generarFactura());
    user.mandarEmailBienvenida();
}

export {};
