package com.palmierbank.config;

import com.palmierbank.entity.Account;
import com.palmierbank.entity.Client;
import com.palmierbank.repository.AccountRepository;
import com.palmierbank.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final ClientRepository clientRepository;
    private final AccountRepository accountRepository;

    public DataLoader(ClientRepository clientRepository, AccountRepository accountRepository) {
        this.clientRepository = clientRepository;
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Client client1 = new Client("Jean", "Dupont", "jean.dupont@email.com", "+33 6 12 34 56 78");
        Client client2 = new Client("Marie", "Martin", "marie.martin@email.com", "+33 6 23 45 67 89");
        Client client3 = new Client("Pierre", "Bernard", "pierre.bernard@email.com", "+33 6 34 56 78 90");

        clientRepository.save(client1);
        clientRepository.save(client2);
        clientRepository.save(client3);

        Account account1 = new Account("ACC-001-2024", 5000.00, "SAVINGS", LocalDate.now(), client1);
        Account account2 = new Account("ACC-002-2024", 12500.50, "CURRENT", LocalDate.now(), client1);

        Account account3 = new Account("ACC-003-2024", 8750.75, "SAVINGS", LocalDate.now(), client2);
        Account account4 = new Account("ACC-004-2024", 3200.00, "CURRENT", LocalDate.now(), client2);

        Account account5 = new Account("ACC-005-2024", 15000.00, "SAVINGS", LocalDate.now(), client3);
        Account account6 = new Account("ACC-006-2024", 6500.25, "CURRENT", LocalDate.now(), client3);

        accountRepository.save(account1);
        accountRepository.save(account2);
        accountRepository.save(account3);
        accountRepository.save(account4);
        accountRepository.save(account5);
        accountRepository.save(account6);

        System.out.println("Sample data loaded successfully for PALMIER BANK!");
    }
}
