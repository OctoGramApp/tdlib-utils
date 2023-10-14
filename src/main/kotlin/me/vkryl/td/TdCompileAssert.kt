/*
 * This file is a part of tdlib-utils
 * Copyright © Vyacheslav Krylov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:JvmName("Td")
@file:JvmMultifileClass

package me.vkryl.td

import me.vkryl.annotation.Autogenerated
import org.drinkless.tdlib.TdApi.*

// Сause compilation error whenever new constructor is added to the TDLib type
// by calling one of the corresponding stub methods below in places, where you expect to support all of them.

@Autogenerated fun assertAuthenticationCodeType_bb3a4b1a (): AuthenticationCodeType? = null // Call, FirebaseAndroid, FirebaseIos, FlashCall, Fragment, MissedCall, Sms, TelegramMessage
@Autogenerated fun assertAuthorizationState_6e5056de (): AuthorizationState? = null // Closed, Closing, LoggingOut, Ready, WaitCode, WaitEmailAddress, WaitEmailCode, WaitOtherDeviceConfirmation, WaitPassword, WaitPhoneNumber, WaitRegistration, WaitTdlibParameters
@Autogenerated fun assertAutosaveSettingsScope_8e19c065 (): AutosaveSettingsScope? = null // ChannelChats, Chat, GroupChats, PrivateChats
@Autogenerated fun assertBackgroundFill_6086fe10 (): BackgroundFill? = null // FreeformGradient, Gradient, Solid
@Autogenerated fun assertBackgroundType_64138c2 (): BackgroundType? = null // Fill, Pattern, Wallpaper
@Autogenerated fun assertBlockList_bbade95a (): BlockList? = null // Main, Stories
@Autogenerated fun assertBotCommandScope_fd010640 (): BotCommandScope? = null // AllChatAdministrators, AllGroupChats, AllPrivateChats, Chat, ChatAdministrators, ChatMember, Default
@Autogenerated fun assertBotWriteAccessAllowReason_d7597302 (): BotWriteAccessAllowReason? = null // AcceptedRequest, AddedToAttachmentMenu, ConnectedWebsite, LaunchedWebApp
@Autogenerated fun assertCallDiscardReason_5812ff30 (): CallDiscardReason? = null // Declined, Disconnected, Empty, HungUp, Missed
@Autogenerated fun assertCallProblem_181dbc7b (): CallProblem? = null // DistortedSpeech, DistortedVideo, Dropped, Echo, Interruptions, Noise, PixelatedVideo, SilentLocal, SilentRemote
@Autogenerated fun assertCallServerType_569fa9f7 (): CallServerType? = null // TelegramReflector, Webrtc
@Autogenerated fun assertCallState_2604589b (): CallState? = null // Discarded, Error, ExchangingKeys, HangingUp, Pending, Ready
@Autogenerated fun assertCallbackQueryPayload_3b0abf6 (): CallbackQueryPayload? = null // Data, DataWithPassword, Game
@Autogenerated fun assertCanBoostChatResult_6ec5626e (): CanBoostChatResult? = null // AlreadyBoosted, InvalidChat, Ok, PremiumNeeded, PremiumSubscriptionNeeded, WaitNeeded
@Autogenerated fun assertCanSendStoryResult_729febd5 (): CanSendStoryResult? = null // ActiveStoryLimitExceeded, BoostNeeded, MonthlyLimitExceeded, Ok, PremiumNeeded, WeeklyLimitExceeded
@Autogenerated fun assertCanTransferOwnershipResult_ac091006 (): CanTransferOwnershipResult? = null // Ok, PasswordNeeded, PasswordTooFresh, SessionTooFresh
@Autogenerated fun assertChatAction_e6a90de7 (): ChatAction? = null // Cancel, ChoosingContact, ChoosingLocation, ChoosingSticker, RecordingVideo, RecordingVideoNote, RecordingVoiceNote, StartPlayingGame, Typing, UploadingDocument, UploadingPhoto, UploadingVideo, UploadingVideoNote, UploadingVoiceNote, WatchingAnimations
@Autogenerated fun assertChatActionBar_9b96400f (): ChatActionBar? = null // AddContact, InviteMembers, JoinRequest, ReportAddBlock, ReportSpam, ReportUnrelatedLocation, SharePhoneNumber
@Autogenerated fun assertChatAvailableReactions_21c76ded (): ChatAvailableReactions? = null // All, Some
@Autogenerated fun assertChatEventAction_d9a53493 (): ChatEventAction? = null // ChatEventActiveUsernamesChanged, ChatEventAvailableReactionsChanged, ChatEventDescriptionChanged, ChatEventForumTopicCreated, ChatEventForumTopicDeleted, ChatEventForumTopicEdited, ChatEventForumTopicPinned, ChatEventForumTopicToggleIsClosed, ChatEventForumTopicToggleIsHidden, ChatEventHasAggressiveAntiSpamEnabledToggled, ChatEventHasProtectedContentToggled, ChatEventInviteLinkDeleted, ChatEventInviteLinkEdited, ChatEventInviteLinkRevoked, ChatEventInvitesToggled, ChatEventIsAllHistoryAvailableToggled, ChatEventIsForumToggled, ChatEventLinkedChatChanged, ChatEventLocationChanged, ChatEventMemberInvited, ChatEventMemberJoined, ChatEventMemberJoinedByInviteLink, ChatEventMemberJoinedByRequest, ChatEventMemberLeft, ChatEventMemberPromoted, ChatEventMemberRestricted, ChatEventMessageAutoDeleteTimeChanged, ChatEventMessageDeleted, ChatEventMessageEdited, ChatEventMessagePinned, ChatEventMessageUnpinned, ChatEventPermissionsChanged, ChatEventPhotoChanged, ChatEventPollStopped, ChatEventSignMessagesToggled, ChatEventSlowModeDelayChanged, ChatEventStickerSetChanged, ChatEventTitleChanged, ChatEventUsernameChanged, ChatEventVideoChatCreated, ChatEventVideoChatEnded, ChatEventVideoChatMuteNewParticipantsToggled, ChatEventVideoChatParticipantIsMutedToggled, ChatEventVideoChatParticipantVolumeLevelChanged
@Autogenerated fun assertChatList_db6c93ab (): ChatList? = null // Archive, Folder, Main
@Autogenerated fun assertChatMemberStatus_33fc5755 (): ChatMemberStatus? = null // Administrator, Banned, Creator, Left, Member, Restricted
@Autogenerated fun assertChatMembersFilter_2127467 (): ChatMembersFilter? = null // Administrators, Banned, Bots, Contacts, Members, Mention, Restricted
@Autogenerated fun assertChatPhotoStickerType_b827816a (): ChatPhotoStickerType? = null // CustomEmoji, RegularOrMask
@Autogenerated fun assertChatSource_12b21238 (): ChatSource? = null // MtprotoProxy, PublicServiceAnnouncement
@Autogenerated fun assertChatStatistics_6744ad70 (): ChatStatistics? = null // Channel, Supergroup
@Autogenerated fun assertChatType_e562ec7d (): ChatType? = null // BasicGroup, Private, Secret, Supergroup
@Autogenerated fun assertCheckChatUsernameResult_936bb8da (): CheckChatUsernameResult? = null // Ok, PublicChatsTooMany, PublicGroupsUnavailable, UsernameInvalid, UsernameOccupied, UsernamePurchasable
@Autogenerated fun assertCheckStickerSetNameResult_98a5b530 (): CheckStickerSetNameResult? = null // NameInvalid, NameOccupied, Ok
@Autogenerated fun assertConnectionState_963d6b5f (): ConnectionState? = null // Connecting, ConnectingToProxy, Ready, Updating, WaitingForNetwork
@Autogenerated fun assertDeviceToken_de4a4f61 (): DeviceToken? = null // ApplePush, ApplePushVoIP, BlackBerryPush, FirebaseCloudMessaging, HuaweiPush, MicrosoftPush, MicrosoftPushVoIP, SimplePush, TizenPush, UbuntuPush, WebPush, WindowsPush
@Autogenerated fun assertDiceStickers_bd2aa513 (): DiceStickers? = null // Regular, SlotMachine
@Autogenerated fun assertEmailAddressAuthentication_8ae3c935 (): EmailAddressAuthentication? = null // AppleId, Code, GoogleId
@Autogenerated fun assertEmailAddressResetState_c8e4d9f5 (): EmailAddressResetState? = null // Available, Pending
@Autogenerated fun assertEmojiCategoryType_fb42e80b (): EmojiCategoryType? = null // ChatPhoto, Default, EmojiStatus
@Autogenerated fun assertFileType_bfc307ca (): FileType? = null // Animation, Audio, Document, None, NotificationSound, Photo, PhotoStory, ProfilePhoto, Secret, SecretThumbnail, Secure, Sticker, Thumbnail, Unknown, Video, VideoNote, VideoStory, VoiceNote, Wallpaper
@Autogenerated fun assertFirebaseAuthenticationSettings_ffcd127a (): FirebaseAuthenticationSettings? = null // Android, Ios
@Autogenerated fun assertGroupCallVideoQuality_68d0c33e (): GroupCallVideoQuality? = null // Full, Medium, Thumbnail
@Autogenerated fun assertInlineKeyboardButtonType_4cba1cc1 (): InlineKeyboardButtonType? = null // Buy, Callback, CallbackGame, CallbackWithPassword, LoginUrl, SwitchInline, Url, User, WebApp
@Autogenerated fun assertInlineQueryResult_6a8a1449 (): InlineQueryResult? = null // Animation, Article, Audio, Contact, Document, Game, Location, Photo, Sticker, Venue, Video, VoiceNote
@Autogenerated fun assertInlineQueryResultsButtonType_7d3d015d (): InlineQueryResultsButtonType? = null // StartBot, WebApp
@Autogenerated fun assertInputBackground_287c144c (): InputBackground? = null // Local, Previous, Remote
@Autogenerated fun assertInputChatPhoto_fb548ada (): InputChatPhoto? = null // Animation, Previous, Static, Sticker
@Autogenerated fun assertInputCredentials_cb4d5ebc (): InputCredentials? = null // ApplePay, GooglePay, New, Saved
@Autogenerated fun assertInputFile_ea011173 (): InputFile? = null // Generated, Id, Local, Remote
@Autogenerated fun assertInputInlineQueryResult_c2856322 (): InputInlineQueryResult? = null // Animation, Article, Audio, Contact, Document, Game, Location, Photo, Sticker, Venue, Video, VoiceNote
@Autogenerated fun assertInputInvoice_18c5681a (): InputInvoice? = null // Message, Name
@Autogenerated fun assertInputMessageContent_4e99a3f (): InputMessageContent? = null // InputMessageAnimation, InputMessageAudio, InputMessageContact, InputMessageDice, InputMessageDocument, InputMessageForwarded, InputMessageGame, InputMessageInvoice, InputMessageLocation, InputMessagePhoto, InputMessagePoll, InputMessageSticker, InputMessageStory, InputMessageText, InputMessageVenue, InputMessageVideo, InputMessageVideoNote, InputMessageVoiceNote
@Autogenerated fun assertInputPassportElement_d81b9316 (): InputPassportElement? = null // Address, BankStatement, DriverLicense, EmailAddress, IdentityCard, InternalPassport, Passport, PassportRegistration, PersonalDetails, PhoneNumber, RentalAgreement, TemporaryRegistration, UtilityBill
@Autogenerated fun assertInputPassportElementErrorSource_80bdb667 (): InputPassportElementErrorSource? = null // DataField, File, Files, FrontSide, ReverseSide, Selfie, TranslationFile, TranslationFiles, Unspecified
@Autogenerated fun assertInputStoryAreaType_c8b647cd (): InputStoryAreaType? = null // FoundVenue, Location, PreviousVenue, SuggestedReaction
@Autogenerated fun assertInputStoryContent_6b57a59a (): InputStoryContent? = null // Photo, Video
@Autogenerated fun assertInternalLinkType_1783a2fc (): InternalLinkType? = null // ActiveSessions, AttachmentMenuBot, AuthenticationCode, Background, BotAddToChannel, BotStart, BotStartInGroup, ChangePhoneNumber, ChatBoost, ChatFolderInvite, ChatFolderSettings, ChatInvite, DefaultMessageAutoDeleteTimerSettings, EditProfileSettings, Game, InstantView, Invoice, LanguagePack, LanguageSettings, Message, MessageDraft, PassportDataRequest, PhoneNumberConfirmation, PremiumFeatures, PrivacyAndSecuritySettings, Proxy, PublicChat, QrCodeAuthentication, RestorePurchases, Settings, SideMenuBot, StickerSet, Story, Theme, ThemeSettings, UnknownDeepLink, UnsupportedProxy, UserPhoneNumber, UserToken, VideoChat, WebApp
@Autogenerated fun assertInviteLinkChatType_5c8a8927 (): InviteLinkChatType? = null // BasicGroup, Channel, Supergroup
@Autogenerated fun assertJsonValue_fe9bf6a4 (): JsonValue? = null // Array, Boolean, Null, Number, Object, String
@Autogenerated fun assertKeyboardButtonType_149cec2d (): KeyboardButtonType? = null // RequestChat, RequestLocation, RequestPhoneNumber, RequestPoll, RequestUser, Text, WebApp
@Autogenerated fun assertLanguagePackStringValue_11536986 (): LanguagePackStringValue? = null // Deleted, Ordinary, Pluralized
@Autogenerated fun assertLogStream_924d9e8f (): LogStream? = null // Default, Empty, File
@Autogenerated fun assertLoginUrlInfo_7af29c11 (): LoginUrlInfo? = null // Open, RequestConfirmation
@Autogenerated fun assertMaskPoint_40914d4e (): MaskPoint? = null // Chin, Eyes, Forehead, Mouth
@Autogenerated fun assertMessageContent_cda9af31 (): MessageContent? = null // MessageAnimatedEmoji, MessageAnimation, MessageAudio, MessageBasicGroupChatCreate, MessageBotWriteAccessAllowed, MessageCall, MessageChatAddMembers, MessageChatChangePhoto, MessageChatChangeTitle, MessageChatDeleteMember, MessageChatDeletePhoto, MessageChatJoinByLink, MessageChatJoinByRequest, MessageChatSetBackground, MessageChatSetMessageAutoDeleteTime, MessageChatSetTheme, MessageChatShared, MessageChatUpgradeFrom, MessageChatUpgradeTo, MessageContact, MessageContactRegistered, MessageCustomServiceAction, MessageDice, MessageDocument, MessageExpiredPhoto, MessageExpiredVideo, MessageForumTopicCreated, MessageForumTopicEdited, MessageForumTopicIsClosedToggled, MessageForumTopicIsHiddenToggled, MessageGame, MessageGameScore, MessageGiftedPremium, MessageInviteVideoChatParticipants, MessageInvoice, MessageLocation, MessagePassportDataReceived, MessagePassportDataSent, MessagePaymentSuccessful, MessagePaymentSuccessfulBot, MessagePhoto, MessagePinMessage, MessagePoll, MessageProximityAlertTriggered, MessageScreenshotTaken, MessageSticker, MessageStory, MessageSuggestProfilePhoto, MessageSupergroupChatCreate, MessageText, MessageUnsupported, MessageUserShared, MessageVenue, MessageVideo, MessageVideoChatEnded, MessageVideoChatScheduled, MessageVideoChatStarted, MessageVideoNote, MessageVoiceNote, MessageWebAppDataReceived, MessageWebAppDataSent
@Autogenerated fun assertMessageExtendedMedia_b5c3a340 (): MessageExtendedMedia? = null // Photo, Preview, Unsupported, Video
@Autogenerated fun assertMessageFileType_79d01776 (): MessageFileType? = null // Group, Private, Unknown
@Autogenerated fun assertMessageForwardOrigin_715b9732 (): MessageForwardOrigin? = null // Channel, Chat, HiddenUser, User
@Autogenerated fun assertMessageReplyTo_699c5345 (): MessageReplyTo? = null // Message, Story
@Autogenerated fun assertMessageSchedulingState_d764a13c (): MessageSchedulingState? = null // SendAtDate, SendWhenOnline
@Autogenerated fun assertMessageSelfDestructType_58882d8c (): MessageSelfDestructType? = null // Immediately, Timer
@Autogenerated fun assertMessageSender_439d4c9c (): MessageSender? = null // Chat, User
@Autogenerated fun assertMessageSendingState_90c81bfe (): MessageSendingState? = null // Failed, Pending
@Autogenerated fun assertMessageSource_eeb3e95 (): MessageSource? = null // ChatEventLog, ChatHistory, ChatList, ForumTopicHistory, HistoryPreview, MessageThreadHistory, Notification, Other, Screenshot, Search
@Autogenerated fun assertMessageSponsorType_ce9e3245 (): MessageSponsorType? = null // Bot, PrivateChannel, PublicChannel, Website
@Autogenerated fun assertNetworkStatisticsEntry_187c867b (): NetworkStatisticsEntry? = null // Call, File
@Autogenerated fun assertNetworkType_6cd85444 (): NetworkType? = null // Mobile, MobileRoaming, None, Other, WiFi
@Autogenerated fun assertNotificationGroupType_afec32af (): NotificationGroupType? = null // Calls, Mentions, Messages, SecretChat
@Autogenerated fun assertNotificationSettingsScope_edff9c28 (): NotificationSettingsScope? = null // ChannelChats, GroupChats, PrivateChats
@Autogenerated fun assertNotificationType_dd6d967f (): NotificationType? = null // NewCall, NewMessage, NewPushMessage, NewSecretChat
@Autogenerated fun assertOptionValue_710db1a4 (): OptionValue? = null // Boolean, Empty, Integer, String
@Autogenerated fun assertPageBlock_b923b80b (): PageBlock? = null // Anchor, Animation, Audio, AuthorDate, BlockQuote, ChatLink, Collage, Cover, Details, Divider, Embedded, EmbeddedPost, Footer, Header, Kicker, List, Map, Paragraph, Photo, Preformatted, PullQuote, RelatedArticles, Slideshow, Subheader, Subtitle, Table, Title, Video, VoiceNote
@Autogenerated fun assertPageBlockHorizontalAlignment_c0d442f9 (): PageBlockHorizontalAlignment? = null // Center, Left, Right
@Autogenerated fun assertPageBlockVerticalAlignment_1d620a05 (): PageBlockVerticalAlignment? = null // Bottom, Middle, Top
@Autogenerated fun assertPassportElement_ed3ed69e (): PassportElement? = null // Address, BankStatement, DriverLicense, EmailAddress, IdentityCard, InternalPassport, Passport, PassportRegistration, PersonalDetails, PhoneNumber, RentalAgreement, TemporaryRegistration, UtilityBill
@Autogenerated fun assertPassportElementErrorSource_10220502 (): PassportElementErrorSource? = null // DataField, File, Files, FrontSide, ReverseSide, Selfie, TranslationFile, TranslationFiles, Unspecified
@Autogenerated fun assertPassportElementType_fe25158a (): PassportElementType? = null // Address, BankStatement, DriverLicense, EmailAddress, IdentityCard, InternalPassport, Passport, PassportRegistration, PersonalDetails, PhoneNumber, RentalAgreement, TemporaryRegistration, UtilityBill
@Autogenerated fun assertPaymentProvider_cba7114d (): PaymentProvider? = null // Other, SmartGlocal, Stripe
@Autogenerated fun assertPollType_324514f9 (): PollType? = null // Quiz, Regular
@Autogenerated fun assertPremiumFeature_e53098c9 (): PremiumFeature? = null // AdvancedChatManagement, AnimatedProfilePhoto, AppIcons, ChatBoost, CustomEmoji, DisabledAds, EmojiStatus, ForumTopicIcon, ImprovedDownloadSpeed, IncreasedLimits, IncreasedUploadFileSize, ProfileBadge, RealTimeChatTranslation, UniqueReactions, UniqueStickers, UpgradedStories, VoiceRecognition
@Autogenerated fun assertPremiumLimitType_7a83028f (): PremiumLimitType? = null // ActiveStoryCount, BioLength, CaptionLength, ChatFolderChosenChatCount, ChatFolderCount, ChatFolderInviteLinkCount, CreatedPublicChatCount, FavoriteStickerCount, MonthlySentStoryCount, PinnedArchivedChatCount, PinnedChatCount, SavedAnimationCount, ShareableChatFolderCount, StoryCaptionLength, StorySuggestedReactionAreaCount, SupergroupCount, WeeklySentStoryCount
@Autogenerated fun assertPremiumSource_4729bf0 (): PremiumSource? = null // Feature, LimitExceeded, Link, Settings, StoryFeature
@Autogenerated fun assertPremiumStoryFeature_ffac8e10 (): PremiumStoryFeature? = null // CustomExpirationDuration, LinksAndFormatting, PermanentViewsHistory, PriorityOrder, SaveStories, StealthMode
@Autogenerated fun assertProxyType_bc1a1076 (): ProxyType? = null // Http, Mtproto, Socks5
@Autogenerated fun assertPublicChatType_fc36b3cf (): PublicChatType? = null // HasUsername, IsLocationBased
@Autogenerated fun assertPushMessageContent_e86d33d2 (): PushMessageContent? = null // Animation, Audio, BasicGroupChatCreate, ChatAddMembers, ChatChangePhoto, ChatChangeTitle, ChatDeleteMember, ChatJoinByLink, ChatJoinByRequest, ChatSetBackground, ChatSetTheme, Contact, ContactRegistered, Document, Game, GameScore, Hidden, Invoice, Location, MediaAlbum, MessageForwards, Photo, Poll, RecurringPayment, ScreenshotTaken, Sticker, Story, SuggestProfilePhoto, Text, Video, VideoNote, VoiceNote
@Autogenerated fun assertReactionType_7dcca074 (): ReactionType? = null // CustomEmoji, Emoji
@Autogenerated fun assertReplyMarkup_d6ebcdbe (): ReplyMarkup? = null // ForceReply, InlineKeyboard, RemoveKeyboard, ShowKeyboard
@Autogenerated fun assertReportReason_cf03e541 (): ReportReason? = null // ChildAbuse, Copyright, Custom, Fake, IllegalDrugs, PersonalDetails, Pornography, Spam, UnrelatedLocation, Violence
@Autogenerated fun assertResetPasswordResult_7d1022f2 (): ResetPasswordResult? = null // Declined, Ok, Pending
@Autogenerated fun assertRichText_58eb3f54 (): RichText? = null // Anchor, AnchorLink, Bold, EmailAddress, Fixed, Icon, Italic, Marked, PhoneNumber, Plain, Reference, Strikethrough, Subscript, Superscript, Underline, Url, s
@Autogenerated fun assertSearchMessagesFilter_f22b2582 (): SearchMessagesFilter? = null // Animation, Audio, ChatPhoto, Document, Empty, FailedToSend, Mention, Photo, PhotoAndVideo, Pinned, UnreadMention, UnreadReaction, Url, Video, VideoNote, VoiceAndVideoNote, VoiceNote
@Autogenerated fun assertSecretChatState_f028091e (): SecretChatState? = null // Closed, Pending, Ready
@Autogenerated fun assertSessionType_c099cac6 (): SessionType? = null // Android, Apple, Brave, Chrome, Edge, Firefox, Ipad, Iphone, Linux, Mac, Opera, Safari, Ubuntu, Unknown, Vivaldi, Windows, Xbox
@Autogenerated fun assertSpeechRecognitionResult_537e9541 (): SpeechRecognitionResult? = null // Error, Pending, Text
@Autogenerated fun assertStatisticalGraph_2332b901 (): StatisticalGraph? = null // Async, Data, Error
@Autogenerated fun assertStickerFormat_4fea4648 (): StickerFormat? = null // Tgs, Webm, Webp
@Autogenerated fun assertStickerFullType_466eed9d (): StickerFullType? = null // CustomEmoji, Mask, Regular
@Autogenerated fun assertStickerType_cc811bb7 (): StickerType? = null // CustomEmoji, Mask, Regular
@Autogenerated fun assertStorePaymentPurpose_b05a5477 (): StorePaymentPurpose? = null // GiftedPremium, PremiumSubscription
@Autogenerated fun assertStoryAreaType_83bfd5bf (): StoryAreaType? = null // Location, SuggestedReaction, Venue
@Autogenerated fun assertStoryContent_c5cd7a63 (): StoryContent? = null // Photo, Unsupported, Video
@Autogenerated fun assertStoryList_cf1e963 (): StoryList? = null // Archive, Main
@Autogenerated fun assertStoryPrivacySettings_77d8fbd3 (): StoryPrivacySettings? = null // CloseFriends, Contacts, Everyone, SelectedUsers
@Autogenerated fun assertSuggestedAction_e3830b06 (): SuggestedAction? = null // CheckPassword, CheckPhoneNumber, ConvertToBroadcastGroup, EnableArchiveAndMuteNewChats, RestorePremium, SetPassword, SubscribeToAnnualPremium, UpgradePremium, ViewChecksHint
@Autogenerated fun assertSupergroupMembersFilter_e70c061b (): SupergroupMembersFilter? = null // Administrators, Banned, Bots, Contacts, Mention, Recent, Restricted, Search
@Autogenerated fun assertTMeUrlType_38521396 (): TMeUrlType? = null // ChatInvite, StickerSet, Supergroup, User
@Autogenerated fun assertTargetChat_75ff347c (): TargetChat? = null // Chosen, Current, InternalLink
@Autogenerated fun assertTextEntityType_542d164b (): TextEntityType? = null // BankCardNumber, Bold, BotCommand, Cashtag, Code, CustomEmoji, EmailAddress, Hashtag, Italic, MediaTimestamp, Mention, MentionName, PhoneNumber, Pre, PreCode, Spoiler, Strikethrough, TextUrl, Underline, Url
@Autogenerated fun assertTextParseMode_ef88df13 (): TextParseMode? = null // HTML, Markdown
@Autogenerated fun assertThumbnailFormat_bf2b0de0 (): ThumbnailFormat? = null // Gif, Jpeg, Mpeg4, Png, Tgs, Webm, Webp
@Autogenerated fun assertTopChatCategory_d3308cd1 (): TopChatCategory? = null // Bots, Calls, Channels, ForwardChats, Groups, InlineBots, Users
@Autogenerated fun assertUpdate_3afd10e9 (): Update? = null // ActiveEmojiReactions, ActiveNotifications, AddChatMembersPrivacyForbidden, AnimatedEmojiMessageClicked, AnimationSearchParameters, AttachmentMenuBots, AuthorizationState, AutosaveSettings, BasicGroup, BasicGroupFullInfo, Call, ChatAction, ChatActionBar, ChatActiveStories, ChatAvailableReactions, ChatBackground, ChatBlockList, ChatDefaultDisableNotification, ChatDraftMessage, ChatFolders, ChatHasProtectedContent, ChatHasScheduledMessages, ChatIsMarkedAsUnread, ChatIsTranslatable, ChatLastMessage, ChatMember, ChatMessageAutoDeleteTime, ChatMessageSender, ChatNotificationSettings, ChatOnlineMemberCount, ChatPendingJoinRequests, ChatPermissions, ChatPhoto, ChatPosition, ChatReadInbox, ChatReadOutbox, ChatReplyMarkup, ChatTheme, ChatThemes, ChatTitle, ChatUnreadMentionCount, ChatUnreadReactionCount, ChatVideoChat, ConnectionState, DefaultReactionType, DeleteMessages, DiceEmojis, FavoriteStickers, File, FileAddedToDownloads, FileDownload, FileDownloads, FileGenerationStart, FileGenerationStop, FileRemovedFromDownloads, ForumTopicInfo, GroupCall, GroupCallParticipant, HavePendingNotifications, InstalledStickerSets, LanguagePackStrings, MessageContent, MessageContentOpened, MessageEdited, MessageInteractionInfo, MessageIsPinned, MessageLiveLocationViewed, MessageMentionRead, MessageSendAcknowledged, MessageSendFailed, MessageSendSucceeded, MessageUnreadReactions, NewCallSignalingData, NewCallbackQuery, NewChat, NewChatJoinRequest, NewChosenInlineResult, NewCustomEvent, NewCustomQuery, NewInlineCallbackQuery, NewInlineQuery, NewMessage, NewPreCheckoutQuery, NewShippingQuery, Notification, NotificationGroup, Option, Poll, PollAnswer, RecentStickers, SavedAnimations, SavedNotificationSounds, ScopeNotificationSettings, SecretChat, SelectedBackground, ServiceNotification, StickerSet, Story, StoryDeleted, StoryListChatCount, StorySendFailed, StorySendSucceeded, StoryStealthMode, SuggestedActions, Supergroup, SupergroupFullInfo, TermsOfService, TrendingStickerSets, UnconfirmedSession, UnreadChatCount, UnreadMessageCount, User, UserFullInfo, UserPrivacySettingRules, UserStatus, UsersNearby, WebAppMessageSent
@Autogenerated fun assertUserPrivacySetting_21d3f4 (): UserPrivacySetting? = null // AllowCalls, AllowChatInvites, AllowFindingByPhoneNumber, AllowPeerToPeerCalls, AllowPrivateVoiceAndVideoNoteMessages, ShowBio, ShowLinkInForwardedMessages, ShowPhoneNumber, ShowProfilePhoto, ShowStatus
@Autogenerated fun assertUserPrivacySettingRule_9d021ccd (): UserPrivacySettingRule? = null // AllowAll, AllowChatMembers, AllowContacts, AllowUsers, RestrictAll, RestrictChatMembers, RestrictContacts, RestrictUsers
@Autogenerated fun assertUserStatus_6492acaf (): UserStatus? = null // Empty, LastMonth, LastWeek, Offline, Online, Recently
@Autogenerated fun assertUserType_233bc6f4 (): UserType? = null // Bot, Deleted, Regular, Unknown
@Autogenerated fun assertVectorPathCommand_4e60caf3 (): VectorPathCommand? = null // CubicBezierCurve, Line