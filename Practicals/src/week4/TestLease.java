package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestLease {
    @Test
    void basicTest(){
        Lease lease = new Lease("A", 2, 22, 4);
        assertEquals(lease.getName(), "A");
        assertEquals(lease.getAptNum(), 2);
        assertEquals(lease.getMonthRent(), 22);
        assertEquals(lease.getTerm(), 4);
    }

    @Test
    void checkAddPetFee(){
        Lease lease = new Lease("A", 2, 22, 4);
        lease.addPetFee();
        assertNotEquals(lease.getMonthRent(), 22);
    }
}