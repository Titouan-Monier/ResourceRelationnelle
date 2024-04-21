package com.resourcerelationnelle;

import com.resourcerelationnelle.citizens.CitizensRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class CitizensRepositoryTests {
    @Autowired private CitizensRepository citizensRepository;

    @Test
    public void testAddNew() {

    }

}
