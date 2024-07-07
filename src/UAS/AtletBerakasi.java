package UAS;

import java.util.Scanner;

public class AtletBerakasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array objek AtletDetail
        AtletDetail[] atletDetails = new AtletDetail[2];

        // Loop untuk menginput detail dua objek AtletDetail
        for (int i = 0; i < atletDetails.length; i++) {
            System.out.print("Masukan nama Atlet ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();
            String id = "";

            // Validasi input ID
            while (true) {
                try {
                    System.out.print("Masukan Id Atlet ke-" + (i + 1) + ": ");
                    id = scanner.nextLine();
                    validateId(id);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Id tidak valid. Harap masukkan id yang benar.");
                } catch (InvalidIdFormatException e) {
                    System.out.println(e.getMessage());
                }
            }

            // Membuat dan menyimpan objek AtletDetail
            atletDetails[i] = new AtletDetail(id, nama);

            // Menambahkan pembatas setelah input data setiap atlet
            if (i < atletDetails.length - 1) {
                System.out.println("---------------");
            }
        }

        // Menambahkan pembatas sebelum menampilkan hasil input
        System.out.println("\n=============== HASIL INPUT ===============\n");

        // Menampilkan informasi dari kedua objek AtletDetail
        for (int i = 0; i < atletDetails.length; i++) {
            System.out.println("Informasi Atlet ke-" + (i + 1) + ":");
            System.out.println(atletDetails[i].displayInfo());

            // Menambahkan pembatas setelah output data setiap atlet
            if (i < atletDetails.length - 1) {
                System.out.println("---------------");
            }
        }

        scanner.close();
    }

    // Metode untuk validasi ID
    private static void validateId(String id) throws NumberFormatException, InvalidIdFormatException {
        if (id.length() < 8) {
            throw new InvalidIdFormatException("Panjang ID kurang dari 8 karakter");
        }
        try {
            Integer.parseInt(id.substring(2, 4)); // Validasi bagian tahun
            Integer.parseInt(id.substring(4, 6)); // Validasi bagian prestasi
            Integer.parseInt(id.substring(6)); // Validasi bagian nomor induk
        } catch (NumberFormatException e) {
            throw new InvalidIdFormatException("ID harus terdiri dari angka pada posisi tertentu");
        }
    }
}

// Kelas exception khusus untuk ID tidak valid
class InvalidIdFormatException extends Exception {
    public InvalidIdFormatException(String message) {
        super(message);
    }
}
