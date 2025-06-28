# Smart Notification System (Phase 1)

🔔 Notification System – Java Project Overview
This project is a basic Java application designed to deepen my understanding of SOLID principles and low-level design (LLD) patterns.

It takes user input: name, preferred communication mode (SMS, WhatsApp, or Email), and the relevant contact info.

Sends a notification message based on the selected mode.



##  What I Focused On

### SOLID Principles in Action

| Principle | How I Applied It |
|----------|------------------|
| SRP (Single Responsibility) | Each class has one clear job — for example, sending notifications, validating input, or adapting a service |
|  OCP (Open/Closed) | I can add new notification types without changing existing code — just extend and plug in |
|  LSP (Liskov Substitution) | All notification classes can be used wherever a Notification interface is expected |
|  ISP (Interface Segregation) | Interfaces like Notification and Validator are focused and lightweight |
|  DIP (Dependency Inversion) | The system depends on abstractions, not concrete classes — making it easier to test and extend |

###  Design Patterns I Used

| Pattern | Where and Why |
|--------|----------------|
|  Adapter | Each notification type (Email, SMS, WhatsApp) uses an adapter to fit into the same interface — this makes adding real APIs in Phase 2 easier |
|  Factory | The main logic dynamically creates the appropriate adapter at runtime based on user input |
|  Strategy-like | I used different validators for different contact types, allowing flexible input validation through interfaces |




## ✅ Phase 1 – What’s Done

- Built the entire notification flow using mock services
- Applied SOLID and design patterns throughout
- Created custom validation and exception handling
- Kept the code clean, modular, and ready to plug in real APIs



## 🔜 Phase 2 – Coming Soon

In the next phase, I plan to:
- Connect to real APIs (Twilio for SMS/WhatsApp, SendGrid or Mailgun for Email)
- Handle configuration through environment files



## 🧪 How to Run

1. Clone or download the project
2. Compile the Java files under `src/`
3. Run `Main.java` from your terminal or IDE and follow the console prompts

---

## 👋 About Me

I'm Sai Nikitha, and I built this project to get a deeper understanding of object-oriented design beyond just syntax. If you’re learning LLD or curious about how SOLID looks in real code, feel free to explore it — and if you have feedback or ideas, I’d love to hear them!

📬 [Connect with me on LinkedIn](https://www.linkedin.com/in/sai-nikitha-neerukonda-b67017275/)

---

## 📄 License

This project is open-sourced under the MIT License, so you’re welcome to learn from or build on it.

