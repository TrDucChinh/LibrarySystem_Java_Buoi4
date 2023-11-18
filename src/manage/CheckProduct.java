package manage;
import product.*;
import system.LibrarySystem;
public class CheckProduct {
    //Check for search
    public static boolean checkInfoBook(Product product, String query) {
        return product.getName().toLowerCase().contains(query.toLowerCase()) ||
                product.getPrice().toLowerCase().contains(query.toLowerCase()) ||
                product.getBrand().toLowerCase().contains(query.toLowerCase()) ||
                ((Book) product).getGenre().toLowerCase().contains(query.toLowerCase()) ||
                ((Book) product).getAuthor().toLowerCase().contains(query.toLowerCase()) ||
                ((Book) product).getPublisher().toLowerCase().contains(query.toLowerCase()) ||
                ((Book) product).getPublishDate().toLowerCase().contains(query.toLowerCase()) ||
                ((Book) product).getLanguage().toLowerCase().contains(query.toLowerCase());
    }

    public static boolean checkInfoNoteBook(Product product, String query) {
        return product.getName().toLowerCase().contains(query.toLowerCase()) ||
                product.getPrice().toLowerCase().contains(query.toLowerCase()) ||
                product.getBrand().toLowerCase().contains(query.toLowerCase()) ||
                ((NoteBook) product).getNumberOfPage().toLowerCase().contains(query.toLowerCase()) ||
                ((NoteBook) product).getType().toLowerCase().contains(query.toLowerCase()) ||
                ((NoteBook) product).getColorOfCover().toLowerCase().contains(query.toLowerCase()) ||
                ((NoteBook) product).getPaperType().toLowerCase().contains(query.toLowerCase()) ||
                ((NoteBook) product).getSize().toLowerCase().contains(query.toLowerCase());
    }

    public static boolean checkInfoPen(Product product, String query) {
        return product.getName().toLowerCase().contains(query.toLowerCase()) ||
                product.getPrice().toLowerCase().contains(query.toLowerCase()) ||
                product.getBrand().toLowerCase().contains(query.toLowerCase()) ||
                ((Pen) product).getColor().toLowerCase().contains(query.toLowerCase()) ||
                ((Pen) product).getMaterial().toLowerCase().contains(query.toLowerCase()) ||
                ((Pen) product).getInkColor().toLowerCase().contains(query.toLowerCase()) ||
                ((Pen) product).getSmoothly().toLowerCase().contains(query.toLowerCase());
    }

    public static boolean checkInfoPencil(Product product, String query) {
        return product.getName().toLowerCase().contains(query.toLowerCase()) ||
                product.getPrice().toLowerCase().contains(query.toLowerCase()) ||
                product.getBrand().toLowerCase().contains(query.toLowerCase()) ||
                ((Pencil) product).getColor().toLowerCase().contains(query.toLowerCase()) ||
                ((Pencil) product).getMaterial().toLowerCase().contains(query.toLowerCase()) ||
                ((Pencil) product).getHardness().toLowerCase().contains(query.toLowerCase());
    }

    public static boolean checkInfoQuery(String query){
        boolean checkBook = false;
        boolean checkPen = false;
        boolean checkNoteBook = false;
        boolean checkPencil = false;
        for (Product product : LibrarySystem.productsList) {
            if (product instanceof Book && CheckProduct.checkInfoBook(product, query)) {
                checkBook = true;
            } else if (product instanceof Pen && CheckProduct.checkInfoPen(product, query)) {
                checkPen = true;
            } else if (product instanceof NoteBook && CheckProduct.checkInfoNoteBook(product, query)) {
                checkNoteBook = true;
            } else if (product instanceof Pencil && CheckProduct.checkInfoPencil(product, query)) {
                checkPencil = true;
            }
        }
        return checkBook || checkPen || checkNoteBook || checkPencil;
    }

    //CheckID
    public static boolean checkIdBook(int id) {
        for (Product product : LibrarySystem.productsList) {
            if (((product instanceof Book) && product.getId() == id)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIdNoteBook(int id) {
        for (Product product : LibrarySystem.productsList) {
            if (((product instanceof NoteBook) && product.getId() == id)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIdPen(int id) {
        for (Product product : LibrarySystem.productsList) {
            if (((product instanceof Pen) && product.getId() == id)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIdPencil(int id) {
        for (Product product : LibrarySystem.productsList) {
            if (((product instanceof Pencil) && product.getId() == id)) {
                return true;
            }
        }
        return false;
    }

    //Check exist product.Product
    public static boolean existBook(String query) {
        boolean checkBook = false;
        for (Product product : LibrarySystem.productsList) {
            if (product instanceof Book) {
                if (CheckProduct.compareName(product, query)){
                    checkBook = true;
                    break;
                }
            }
        }
        return !checkBook;
    }

    public static boolean existNoteBook(String query) {
        boolean checkNoteBook = false;
        for (Product product : LibrarySystem.productsList) {
            if (product instanceof NoteBook) {
                if (CheckProduct.compareName(product, query)) {
                    checkNoteBook = true;
                    break;
                }
            }
        }
        return !checkNoteBook;
    }

    public static boolean existPen(String query) {
        boolean checkPen = false;
        for (Product product : LibrarySystem.productsList) {
            if (product instanceof Pen) {
                if (CheckProduct.compareName(product, query)) {
                    checkPen = true;
                    break;
                }
            }
        }
        return !checkPen;
    }
    public static boolean existPencil(String query) {
        boolean checkPencil = false;
        for (Product product : LibrarySystem.productsList) {
            if (product instanceof Pencil) {
                if (CheckProduct.compareName(product, query)) {
                    checkPencil= true;
                    break;
                }
            }
        }
        return !checkPencil;
    }
    //Compare
    public static boolean compareName(Product product, String  query) {
        return product.getName().equals(query);
    }
}
