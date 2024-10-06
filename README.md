## Getting Started
1. Cài đặt Docker
2. Build Docker (mysql , phpAdmin)
3. Tableplus để quản lý db (miễn phí nếu mở 2 tab)
4. Makefile để chạy nhanh câu lệnh( nếu cần)

## Các bước làm
1. Copy .env.sample to .env
```bash
cp .env.sample .env
```
2. Build Docker - Run docker compose (xem cấu hình trong file /docker-compose.yml)
```bash
docker-compose build
docker-compose up or docker-compose up -d
```
*** note ***
docker-compose up : chạy xong để xem trong quá build có lỗi j hay không (ctrl+C để tắt)
docker-compose up -d: chạy xong rùi thoát
--> có thể dùng: docker-compose up -d mysql: mysql tên service cần build


