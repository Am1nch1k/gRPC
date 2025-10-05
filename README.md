# gRPC Project

![gRPC](https://img.shields.io/badge/gRPC-1.48.0-blue?style=flat-square)
![Protocol Buffers](https://img.shields.io/badge/Protocol%20Buffers-3.21.1-green?style=flat-square)

Минималистичная реализация gRPC сервиса с примерами клиента и сервера.

## 🚀 Особенности

- **gRPC сервер** с поддержкой unary вызовов
- **gRPC клиент** для тестирования соединения
- **Protocol Buffers** для определения сервисов
- Простая и понятная кодовая база

## 📦 Структура проекта
gRPC/
├── proto/ # Proto файлы
├── src/
│ ├── client/ # Клиентская реализация
│ └── server/ # Серверная реализация
└── README.md

text

## 🛠️ Быстрый старт

### Установка зависимостей
```bash
# Установите необходимые зависимости для работы с gRPC
Запуск сервера
bash
cd src/server
python server.py
Запуск клиента
bash
cd src/client
python client.py
📚 Используемые технологии
gRPC - высокопроизводительный RPC фреймворк

Protocol Buffers - язык-независимый механизм сериализации

Python - язык реализации

🤝 Вклад
Приветствуются pull requests и предложения по улучшению кода.
