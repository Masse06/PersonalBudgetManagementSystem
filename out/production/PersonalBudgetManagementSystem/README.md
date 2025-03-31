# Sistema de Gestión de Presupuesto Personal

Este es un sistema para gestionar el presupuesto personal, que te permite llevar un control de tus ingresos, gastos y calcular el saldo disponible. Puedes agregar, editar y eliminar ingresos y gastos, además de categorizarlos y obtener un resumen mensual.

## Funcionalidades

- **Registrar ingresos**: Puedes agregar tus fuentes de ingresos (por ejemplo, salario, venta de productos).
- **Registrar gastos**: Puedes agregar tus gastos, clasificarlos en categorías como alimentación, entretenimiento, transporte, entre otros.
- **Calcular balance**: El sistema calcula el balance disponible restando los gastos de los ingresos.
- **Generar resumen**: El sistema muestra un resumen mensual con todos los ingresos y gastos registrados.

## Clases principales

### Clase `Transaction` (Clase base)
- **Atributos**:
  - `description` (String): Descripción de la transacción (ejemplo: "salario", "compras").
  - `amount` (double): El monto de la transacción.
  - `date` (String): Fecha en que ocurrió la transacción.

### Clase `Income` (Hereda de `Transaction`)
- **Atributos**:
  - `source` (String): Fuente del ingreso (ejemplo: "salario", "venta de productos").

### Clase `Expense` (Hereda de `Transaction`)
- **Atributos**:
  - `category` (String): Categoría del gasto (ejemplo: "alimentación", "transporte").

### Clase `Budget`
- **Atributos**:
  - `incomes` (ArrayList<Income>): Lista de los ingresos registrados.
  - `expenses` (ArrayList<Expense>): Lista de los gastos registrados.
- **Métodos**:
  - `addIncome(Income income)`: Agrega un ingreso a la lista de ingresos.
  - `addExpense(Expense expense)`: Agrega un gasto a la lista de gastos.
  - `calculateBalance()`: Calcula el balance total (ingresos - gastos).
  - `generateSummary()`: Muestra un resumen de los ingresos y gastos.

### Clase `Main`
- **Funcionalidad**:
  - Crea varios objetos de tipo `Income` y `Expense`.
  - Agrega estos objetos a un objeto `Budget`.
  - Muestra el balance y el resumen mensual.

