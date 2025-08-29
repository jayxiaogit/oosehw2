Using ChatGPT AI:

Prompt:
Suppose you are tasked with designing a new "Property Management" application that allows users to:

Pay monthly rent
Submit and track maintenance requests
Exchange messages with their landlord
View a list of community events

1. Questions:
a. Write a problem statement for this application:
Managing rental properties often involves fragmented communication and inefficient processes between tenants and landlords. Tenants typically face difficulties such as delayed rent payment methods, lack of transparency in maintenance request status, and limited channels for communicating with property managers or landlords. Similarly, landlords and property managers struggle to keep track of tenant requests, manage payments in an organized manner, and foster a sense of community within their properties.
Currently, these interactions are scattered across multiple platforms—manual rent collection, email or phone calls for maintenance, and inconsistent community engagement efforts—resulting in miscommunication, delays, and reduced tenant satisfaction.
There is a need for a centralized digital platform that streamlines property management by enabling tenants to:
Pay monthly rent securely and on time
Submit and track the status of maintenance requests
Communicate directly with their landlord or property manager
Stay informed about and engage with community events
Such a solution would not only enhance tenant convenience and satisfaction but also improve operational efficiency for landlords and property managers by consolidating essential functions into one application.


b. Suggest several user stories:
For Tenants
As a tenant, I want to pay my rent online so that I don’t have to write checks or visit the leasing office.
As a tenant, I want to set up automatic rent payments so that I never miss a due date.
As a tenant, I want to submit a maintenance request so that issues in my unit can be fixed quickly.
As a tenant, I want to track the status of my maintenance requests so that I know when they will be resolved.
As a tenant, I want to message my landlord through the app so that I can easily communicate without relying on email or phone calls.
As a tenant, I want to receive notifications when my landlord replies so that I don’t miss important updates.
As a tenant, I want to view a list of community events so that I can participate and engage with my neighbors.
As a tenant, I want to RSVP to community events so that I can let others know I’m attending.
For Landlords/Property Managers
As a landlord, I want to view rent payment history so that I can track who has paid and who is overdue.
As a landlord, I want to send reminders for rent payments so that tenants are notified before the due date.
As a landlord, I want to receive maintenance requests from tenants so that I can assign them to maintenance staff.
As a landlord, I want to update the status of maintenance requests so that tenants know when work is in progress or completed.
As a landlord, I want to send announcements about community events so that all tenants are informed.
As a landlord, I want to broadcast important messages (e.g., water shutoff, fire alarm testing) so that tenants receive timely alerts.


c. Recommend the most suitable type of application (Mobile, Web, or Desktop)
Mobile App (Most Suitable) ✅
Why:
Renters typically need quick, on-the-go access (e.g., pay rent, message landlord, track requests).
Push notifications can instantly alert tenants about rent due dates, landlord messages, or community events.
Mobile cameras make it easy for tenants to attach photos/videos of maintenance issues.
Best for: Tenants and landlords who need convenience, reminders, and communication in real-time.
Web Application (Complementary)
Why:
A web app is useful for landlords and property managers who may prefer managing payments, requests, and reports from a larger screen.
Easier integration with accounting or property management software.
Best for: Administrative tasks, reporting, and managing multiple properties at once.

d. Propose a software architecture
Here’s a pragmatic, scalable architecture for the Property Management app that balances speed-to-market with a clear path to scale.
High-level approach
Client tier: Mobile app (primary) + responsive Web app (admin/PM dashboards).
Backend: Start as a modular monolith (clearly separated modules + internal packages) behind an API gateway. Evolve to microservices when scale/teams demand it.
Data: Relational DB for core entities; document store for messaging; object storage for media; cache for hot reads.
Integration & async: Event bus for decoupling (notifications, analytics, billing webhooks).
Observability & Ops: CI/CD, containerized runtime, centralized logging/metrics/tracing.

e. Suggest an appropriate software stack
Mobile (Primary):
Framework: React Native (cross-platform for iOS & Android, code reuse, push notifications, camera integration for maintenance photos).
Alternative: Flutter if you prefer stronger performance and a unified UI across devices.
Web (Secondary, for Landlord/PM dashboards):
Framework: React + Next.js (SSR for SEO-friendly event listings, fast dashboards).
UI Components: Tailwind CSS or Material UI for consistency.
State Management: React Query (for API cache) + Context/Zustand.
⚙️ Backend
Language & Framework:
Node.js + NestJS (structured, modular, TypeScript end-to-end with React Native/Web).
Alternative: Java (Spring Boot) or Python (FastAPI/Django Rest Framework) if team prefers.
API Layer:
REST API for CRUD endpoints.
GraphQL (Apollo Server) for mobile dashboard queries (reduce over-fetching).
WebSockets (or Socket.IO) for real-time messaging + maintenance request updates.
Authentication & Authorization:
OAuth 2.1 / OIDC (Auth0, AWS Cognito, or Keycloak if self-hosted).
JWTs with role-based claims (Tenant, Landlord, PropertyManager, Maintenance).
✅ Summary Recommendation:
Frontend: React Native (mobile) + React/Next.js (web)
Backend: Node.js + NestJS (REST + GraphQL), PostgreSQL + MongoDB, Redis
Payments: Stripe
Notifications: FCM/APNs + Twilio + SendGrid
Infra: AWS (EKS, S3, RDS, CloudFront), CI/CD with GitHub Actions

2. Reflextion and evaluation
a. I agree. Overall I think this problem statement suggestion was reasonable. It gave background into the problem, and then outlined what the app would need to do. The only fault I could find is that the AI said "Stay informed about and engage with community events", which is slightly different from the task of allowing users to "View a list of community events".

b. I agree. I think that the user stories were reasonable given the problem statement. It considered the stories of both landlords and tenants, giving multiple stories that covered every functional requirement we had, plus a few extra requirements.

c. I also agreed with the AI on this prompt. I think that a mobile app is just the most convenient way for both tenants and landlords to access the application, since they can access it from anywhere. It also makes sense to suggest that it also be accessible by computer, in case landlords want to work from their computers to do more complicated work.

d. I kind of agreed with the AI. It sounded like it was proposing Client-Server Architecture, but a specific kind that I'm not familiar with(modular monolith). It considered scaling as well.

e. I agree with the AI here too, it is listing tools that are widely used in software development (React frontend, Node.js backend). This is a familiar architecture that I have seen, so I think this suggestion is reasonable.
