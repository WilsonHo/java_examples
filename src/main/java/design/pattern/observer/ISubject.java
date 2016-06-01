package design.pattern.observer;

/**
 * Created by baohg on 01/06/2016.
 */
public interface ISubject {
    public void attachObserver(IObserver observer);
    // thêm đối tượng đăng ký lắng nghe thông báo.

    public void detachObserver(IObserver observer);
    // hủy đối tượng đăng ký lắng nghe thông báo

    public void notifyObserver();
    // thong bao đến tất cả các đối tượng đã đăng ký thông báo.
}
