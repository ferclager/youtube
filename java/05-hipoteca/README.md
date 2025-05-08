# Calculadora de Hipoteca en Java

## Características

 - Introduce el total del préstamo (principal)
 - Introduce la tasa de intéres anual
 - Introduce el plazo del préstamo en años
 - Calcula el pago mensual usando la fórmula estándar de amortización

## Fórmula usada

```
M = P [ r (1 + r)^n] / [(1 + r)^n - 1]
```
- M = pago mensual
- P = cantidad del préstamo (principal)
- r = tasa de intéres mensual (anual / 12 / 100)
- n = número total de pagos (años * 12)