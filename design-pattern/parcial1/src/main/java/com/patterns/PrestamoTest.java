package com.patterns;

public class PrestamoTest {
    private Cliente cliente;
    private Prestamo prestamo;
    @BeforeEach
    public void setUp(){
        cliente = new Cliente ("Juan", 5000);
        prestamo = new Simple(100, 10, cliente, 5);
    }
    @Test
    public void testSolicitarPrestamo(){
        cliente.solicitarPrestamo(prestamo);
        assertequals(prestamo instanceof Simple);
    }
}
