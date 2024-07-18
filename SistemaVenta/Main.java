public class Main {
    public static void main(String[] args) {
        // Ejemplo de creación de productos (modelos de iPhone)
        Producto iPhone12 = new Producto("iPhone 12", 50);
        Producto iPhone13 = new Producto("iPhone 13", 30);
        Producto iPhoneSE = new Producto("iPhone SE", 20);
        Producto iPhone11 = new Producto("iPhone 11", 15);
        Producto iPhoneXR = new Producto("iPhone XR", 10);

        
        iPhone12.setCantidadComprada(3); // Simula la compra de 3 unidades del iPhone 12
        iPhone13.setCantidadComprada(2); 
        // Actualizar el stock después de las compras
        iPhone12.actualizarStock();
        iPhone13.actualizarStock();

        // Mostrar el stock disponible después de las compras
        System.out.println("Stock disponible de iPhone 12: " + iPhone12.getStockDisponible());
        System.out.println("Stock disponible de iPhone 13: " + iPhone13.getStockDisponible());
        System.out.println("Stock disponible de iPhone SE: " + iPhoneSE.getStockDisponible());
        System.out.println("Stock disponible de iPhone 11: " + iPhone11.getStockDisponible());
        System.out.println("Stock disponible de iPhone XR: " + iPhoneXR.getStockDisponible());
    }
}

