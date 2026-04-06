void main() {
      Almacen almacen = new Almacen();

      Paquete p1 = new Paquete("A1", 12.5, "Madrid");
      Paquete p2 = new Paquete("A2", 25.4, "Barcelona");
      Paquete p3 = new Paquete("A3", 8.2, "Valencia");
      Paquete p4 = new Paquete("A4", 5.0, "Sevilla");

      almacen.recepcionarPaquete(p1, 0, 0);
      almacen.recepcionarPaquete(p2, 0, 1);
      almacen.recepcionarPaquete(p3, 1, 0);
      almacen.recepcionarPaquete(p4, 2, 2);

      System.out.println("\n 2. DESPACHO AL CAMIÓN ");

      almacen.enviarACamion(0, 0);
      almacen.enviarACamion(0, 1);

      almacen.mantenimientoSeguridad(20.0);
    }