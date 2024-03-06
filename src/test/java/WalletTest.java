import org.example.Wallet;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {

    private Wallet wallet;

    @BeforeEach
    void testSetUp() {
        wallet = new Wallet("Anis");
    }

    @Test
    void testSetOwner() {
        assertEquals("Anis", wallet.owner);

        wallet.setOwner("Annisa");
        assertEquals("Annisa", wallet.owner);
    }

    @Test
    void testTambahKartu() {
        wallet.tambahKartu("Kartu Kredit");
        assertTrue(wallet.listKartu.contains("Kartu Kredit"));
    }

    @Test
    void testAmbilKartu() {
        wallet.tambahKartu("Kartu Kredit");

        // Tes ketika kartu ada
        assertEquals("Kartu Kredit", wallet.ambilKartu("Kartu Kredit"));

        // Tes ketika kartu tidak ada
        assertNull(wallet.ambilKartu("Kartu Debit"));
    }

    @Test
    void testTambahUangRupiah() {
        // Tes penambahan uang koin
        wallet.tambahUangRupiah(500);
        assertTrue(wallet.listUangKoin.contains(500));

        // Tes penambahan uang kertas
        wallet.tambahUangRupiah(1500);
        assertTrue(wallet.listUangLembaran.contains(1500));
    }

    @Test
    void testAmbilUang() {
        // Tes pengambilan uang koin
        wallet.tambahUangRupiah(500);
        assertEquals(500, wallet.ambilUang(500));
        assertFalse(wallet.listUangKoin.contains(500));

        // Tes pengambilan uang kertas
        wallet.tambahUangRupiah(1500);
        assertEquals(1500, wallet.ambilUang(1500));
        assertFalse(wallet.listUangLembaran.contains(1500));

        // Tes ketika jumlah uang yang ditentukan tidak tersedia
        assertEquals(0, wallet.ambilUang(1000));
    }

    @Test
    void testTampilkanUang() {
        wallet.tambahUangRupiah(500);
        wallet.tambahUangRupiah(1500);

        assertEquals(2000, wallet.tampilkanUang());
    }
}
