package gyakorlas2.trainer;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AuctionTest {
    @Test
    void testClone() {
        Auction auction = new Auction(5, LocalDateTime.parse("2020-01-01T12:00"));
        Auction another = new Auction(auction);

        assertEquals(5, another.getPrice());
        assertEquals(auction.getStart(), another.getStart());
        auction.setPrice(10);
        assertEquals(5, another.getPrice());
        assertEquals(10, auction.getPrice());

    }
}