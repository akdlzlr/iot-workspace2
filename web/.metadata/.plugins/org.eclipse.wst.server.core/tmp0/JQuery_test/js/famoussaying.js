
function createFamousSaying(){
	
	function parse(str,index){
		var tokens = str.split('#');
		return {		//	객체 생성 후 리턴
			id: index,
			statement : tokens[0].trim(),	// trim 양쪽 공백 지움
			who : tokens[1].trim()
		};
	}
	
	var str = `
큰 목표를 이루고 싶으면 허락을 구하지 마라.#미상
상황을 가장 잘 활용하는 사람이 가장 좋은 상황을 맞는다.#존 우든
창조적인 삶을 살려면 내가 틀릴지도 모른다는 공포를 버려야 한다.#미상
일반적인 것을 잃을 위험을 감수하지 않으면 평범한 것에 만족해야 한다.#짐 론
신뢰의 이유는 안전하거나 확실해서가 아니라, 위험을 감수할 용의가 있어서이다.#미상
한 가지 생각을 선택하라. 그 생각을 당신의 삶으로 만들어라. 그걸 생각하고, 꿈꾸고, 그에 기반해서 살아가라. 당신의 몸의 모든 부분, 뇌, 근육, 신경을 그 생각으로 가득 채우고 다른 생각은 다 내버려둬라. 이것이 성공하는 방법이다.#스와미 비베카난다
추구할 수 있는 용기가 있다면 우리의 모든 꿈은 이뤄질 수 있다.#월트 디즈니
기다리는 사람에게 좋은 일이 생기지만, 찾아나서는 사람에게는 더 좋은 일이 생긴다.#미상
늘 하던 대로 하면 늘 얻던 것을 얻는다.#미상
열정을 잃지 않고 실패에서 실패로 걸어가는 것이 성공이다.#윈스턴 처칠
애벌레가 세상이 끝났다고 생각하는 순간 나비로 변했다.#속담
성공한 사업가들은 긍정적인 에너지를 주는 사람들이지 가져가는 사람들이 아니다.#미상
성공한 사람을 볼 때 당신은 대중에게 드러난 영예만 보지, 절대 그 영예를 얻기 위해 했던 개인적 희생은 보지 않는다.#바입하브 샤
기회는 일어나는 것이 아니라 만들어내는 것이다.#크리스 그로서
성공한 사람이 되려고 노력하기보다 가치있는 사람이 되려고 노력하라.#알버트 아인슈타인
위대한 정신을 가진 사람들은 생각을 논한다. 평범한 사람들은 사건을 논한다. 마음이 좁은 사람들은 사람들을 논한다.#엘리너 루즈벨트
나는 실패한 게 아니다. 나는 잘 되지 않는 방법 1만 가지를 발견한 것이다.#토마스 에디슨
당신이 자신의 시간을 가치있게 생각하지 않으면 남들도 마찬가지일 것이다. 시간과 재능을 막 나눠주지 말고 팔아라.#킴 가스트
남들이 당신에게 던진 벽돌들로 탄탄한 기반을 쌓을 수 있어야 성공한다.#데이비드 브링클리
당신이 허락해주지 않으면 아무도 당신이 열등감을 느끼게 만들 수 없다.#엘리너 루즈벨트
성공적인 삶의 비밀은 무엇을 하는 게 자신의 운명인지 찾아낸 다음 그걸 하는 것이다.#헨리 포드
지옥을 겪고 있다면 계속 겪어 나가라.#윈스턴 처칠
자기가 세상을 바꿀 수 있다고 생각할 정도로 미친 사람들이 세상을 바꾼다.#미상
언성을 높이지 말고 논거를 강화하라.#미상
괴로운 시련처럼 보이는 것이 뜻밖의 좋은 일일 때가 많다.#오스카 와일드
삶의 의미는 자신의 재능을 발견하는 것이다. 삶의 목적은 그것을 나눠주는 것이다.#미상
광기와 천재성 사이의 거리는 성공으로만 측정된다.#브루스 페어스타인
잘못된 것들을 쫓아다니는 것을 그만두면 옳은 일들이 당신을 따라잡을 기회가 생긴다.#롤리다스칼
위대한 것으로 향하기 위해 좋은 것을 포기하는 걸 두려워하지 마라.#존 록펠러
게으른 예술가가 만든 명작은 없다.#미상
행복은 나비다. 당신이 쫓아다니면 늘 잡을 수 없는 곳에 있지만, 조용히 앉아 있으면 당신에게 내려앉을지도 모른다.#나다니엘 호손
간단하게 설명할 수 없으면 제대로 이해하지 못하는 것이다.#알버트 아인슈타인
주고 기억하지 않고, 받고 잊지 않는 사람들에게 복이 있나니.#미상
매일 당신을 두렵게 만드는 일을 하나씩 하라.#미상
놀라운 일을 하려고 노력조차 하지 않을 거면 살아 있어서 뭐하나.#미상
인생이란 자신을 찾는 것이 아니라 자신을 만드는 것이다.#롤리 다스칼
이 세상에 재능이 있는데 성공하지 못한 사람보다 더 흔한 건 없다.#미상
지식이란 당신이 뭘 할 수 있는지 아는 것이다. 지혜란 하지 않아야 할 때를 아는 것이다.#미상
당신의 문제가 문제가 아니라 당신의 반응이 문제다.#미상
뭐든 할 수 있지만 모든 걸 할 수 있는 건 아니다.#미상
혁신이 지도자와 추종자를 가른다.#스티브 잡스
당신이 세상을 바꿀 수 없다고 말하는 사람에는 두 종류가 있다. 시도하기를 두려워하는 사람들, 당신이 성공할까 봐 두려워하는 사람들.#레이고포스
당신이 살면서 어떤 부침을 겪든 간에 생각이 당신의 기본 자산이 되어야 한다.#APJ 칼람
나는 내가 더 노력할수록 운이 더 좋아진다는 걸 발견했다.#토마스 제퍼슨
모든 성취의 시작점은 갈망이다.#나폴레온 힐
성공은 매일 반복한 작은 노력들의 합이다.#로버트 콜리어
뛰어난 걸 원하면 오늘 당장 이룰 수 있다. 지금 당장 뛰어나지 못한 일을 그만둬라.#토마스J. 왓슨
모든 진보는 익숙한 영역이 아닌 곳에서 이뤄진다.#마이클 존 보박
성공을 갈망할 때만 성공할 수 있고, 실패해도 상관없다고 생각할 때만 실패할 수 있다#필리포스
용기는 공포에 대한 저항, 공포의 지배이지 공포의 부재가 아니다.#마크 트웨인
마치지 않고 죽어도 되는 일만 내일로 미뤄라.#파블로 피카소
사람들은 동기 부여는 오래가지 않는다고 말한다. 목욕도 마찬가지다. 그래서 매일 하라고하는 것이다.#지그 지글러
우리는 우리가 늘 생각하는 것이 된다. 그것이 가장 묘한 비밀이다.#얼 나이팅게일
성공(success)이 노력(work)보다 먼저 나타나는 유일한 곳은 사전이다.#비달 사순
조직을 만들어야 할 가장 좋은 이유는 의미를 만들기 위해서이다. 세상을 더 좋은 곳으로 만드는 제품이나 서비스를 만들기 위해서이다.#가이 카와사키
삶에 진정한 흥미가 있고 호기심이 있는 삶을 살면 잠이 가장 중요한 것이 아니게 된다는 것을 발견했다.#마사 스튜어트
당신이 눈으로 보는 것이 아니라 진짜로 발견하는 것이 무엇인가가 중요하다.#미상
성공으로 가는 길과 실패로 가는 길은 거의 똑같다.#콜린 R. 데이비스
리더십의 기능은 지도자를 더 많이 만드는 것이지 추종자를 더 많이 만드는 게 아니다.#랄프 네이더
성공이란 당신 자신, 당신이 하는 일, 그 일을 하는 방식을 좋아하는 것이다.#마야 앤젤루
다음 세기를 바라보는 지금, 지도자들은 다른 사람들에게 힘을 주는 사람이 될 것이다.#빌 게이츠
진짜 사업가는 안전망이 없는 사람이다.#헨리 크래비스
애초에 처한 상황의 포로가 되기를 거부할 때 성공으로 가는 첫 발을 내딛은 것이다.#마크케인
성공한 사람에겐 모멘텀이 있다. 성공할수록 더 성공하고 싶어지고, 성공할 방법을 더 많이 찾아낸다. 마찬가지로, 실패하면 자기충족적 예언이 될수도 있는 하강 경향이 생긴다.#토니 로빈스
내가 강해질 용기를 낼 때, 내 힘을 내 비전을 위해 사용할 때 내가 두려워하는지 여부는점점덜 중요해진다.#오드리 로드
당신이 다수의 편에 서 있다는 걸 깨닫게 될 때가 다시 생각해볼 때이다.#마크 트웨인
성공한 전사는 면도날 같은 초점을 지닌 평범한 사람이다.#브루스 리
실패에서부터 성공을 만들어 내라. 좌절과 실패는 성공으로 가는 가장 확실한 디딤돌이다.#데일 카네기
당신의 인생을 스스로 설계하지 않으면 다른 사람의 계획에 빠져들 가능성이 크다. 남들이 당신을 위해 계획해 놓은 것? 많지 않다.#짐 론
당신이 정말로 뭔가를 원한다면 기다리지 마라. 견디지 못하는 법을 스스로에게 가르쳐라.#구르박쉬 차할
패배의 공포가 승리의 짜릿함보다 커지게 하지 마라.#로버트 키요사키
영속적인 변화를 이루고 싶으면 당신의 문제의 크기에 집중하지 말고 당신의 크기에 집중하라!#T. 하브 에커
앞을 보며 점과 점을 연결할 수는 없다. 뒤돌아볼 때만 가능하다. 그러니 당신은 미래에 언젠가 점들이 연결될 거라고 믿어야 한다. 무언가를 믿어야 한다. 당신의 직감, 운명, 삶, 카르마, 뭐든지. 이 접근법은 한 번도 나를 실망시킨 적이 없고, 내 삶의 모든 것을 이뤄내게 해주었다.#스티브 잡스
성공한 사람들은 성공하지 않은 사람들이 하지 않으려는 것을 한다. 더 쉬웠으면 하고 바라지말고 내가 더 나았으면 하고 바라라.#짐 론
사람들이 인생에서 실패하는 가장 큰 이유는 친구, 가족, 이웃들의 말을 듣기 때문이다.#나폴레온 힐
대부분의 사람들이 결코 목표를 이루지 못하는 이유는 그들은 목표를 정의하지 않거나, 단 한번도 진지하게 그 목표가 믿을 수 있는 것, 이룰 수 있는 것이라고 생각해보지 않기 때문이다. 승리하는 사람들은 자신이 어디로 가고 있는지, 그 과정에서 어떤 일을 할 계획인지, 그 모험을 누구와 함께 할 것인지 알고 있다.#데니스 웨이틀리
내 경험으로 동기란 단 하나뿐이고, 그건 갈망이다. 어떤 판단이나 원칙도 그걸 누르거나 저항할 수 없다.#제인 스마일리
성공이란 절대 실수를 하지 않는 게 아니라 같은 실수를 두 번 하지 않는 것에 있다.#조지버나드 쇼
내 삶이 끝날 때 내가 내 삶의 길이만큼만 살았다는 걸 깨닫고 싶지 않다. 내 삶의 폭도 살고싶다.#다이앤 애커먼
위대한 일들을 이루기 전에 스스로에게 위대한 일들을 기대해야 한다.#마이클 조던
동기 부여가 당신을 시작하게 한다. 습관이 당신을 계속 움직이게 한다.#짐 륜
과정에서 재미를 느끼지 못하는데 성공하는 일은 거의 없다.#데일 카네기
단호한 마음의 굳은 결심을 막거나 통제할 수 있는 우연, 운명, 숙명이란 없다.#엘라 휠러 윌콕스
우리의 가장 큰 공포는 실패에 대한 공포가 아니라 인생에서 진정 중요하지 않은 일들에 성공하는 것에 대한 두려움이어야 한다.#프랜시스 찬
만족스럽게 잠자리에 들려면 매일 아침 투지를 가지고 일어나야 한다.#조지 로리머
성공하려면 당신을 찾아오는 모든 도전을 다 받아들여야 한다. 마음에 드는 것만 골라 받을 수는 없다.#마이크 가프카
성공이란 당신 삶의 목적을 깨닫고, 당신의 잠재력을 전부 발휘하고, 남들에게 도움이 되는 씨를 뿌리는 것이다.#존 C. 맥스웰
비참해져라. 혹은 스스로에게 동기를 부여하라. 뭘 해야 하든, 그건 언제나 당신의 선택이다.#웨인 다이어
위대한 것을 이루려면 우리는 행동할 뿐 아니라 꿈도 꾸어야 하고, 계획할 뿐 아니라 믿기도해야 한다.#아나톨 프랑스
세상에서 가장 중요한 일들 대부분은 아무도 도와주지 않을 때에도 계속 노력한 사람들에 의해 이루어졌다.#데일 카네기
성취의 크기는 목표를 이루기 위해 당신이 극복해야 했던 장애물의 크기로 잰다.#부커 T. 워싱턴
진짜 어려움은 극복할 수 있다. 정복할 수 없는 것은 상상 속의 어려움들뿐이다.#시어도어N. 베일
모방해서 성공하는 것보다 독창적으로 실패하는 게 더 낫다.#허먼 멜빌
운은 용기를 내는 사람의 편이다#베르길리우스
소인배는 불운에 길들여지고 눌린다. 그러나 위대한 사람들은 불운 위로 올라선다.#워싱턴 어빙
실패는 성공을 맛내는 양념이다.#트루먼 카포티
당신이 할 수 없는 일이 할 수 있는 일에 지장을 주게 하지 마라.#존 R. 우든
이기기 위해서는 한 번 이상 전쟁을 치러야 할 때도 있다.#마가렛 대처
인간은 자신이 원하는 만큼 위대해질 수 있다. 자신을 믿고 용기, 투지, 헌신, 경쟁력있는 추진력을 가진다면, 그리고 가치있는 것들을 위한 대가로 작은 것들을 희생할 용의가 있다면 가능하다.#빈스 롬바디
서로를 용서하는 것이야 말로 가장 아름다운 사랑의 모습이다.#존 셰필드`;
	
	var list = str.split('\n')
					.filter(item=>item.trim())
		// trim으로 공백을 지워 리턴값을 false로 만든다. 즉 비어있는 문자열은 삭제
					.shuffle()
					.map(parse);	// 원하는 형태로 맵핑한다.	

	
	return list;
	
}

class FSList {
	constructor() {
		this.list=createFamousSaying();
		this.totalPage = Math.ceil(this.list.length/12);
	}
	
	getPage(page){
		var start=(page-1)*12;
		var end = start+12;
		
		return this.list.slice(start, end);
		//	this는 객체의 필드를 가져올때 쓴다. 인스턴스 접근시 사용
		//	호출한 쪽이 this가 된다.
	}
	
	remove(id){
		var index = this.findById(id);
		if(index !=-1){
			this.list.splice(index,1);
		//	배열에서 하나만 지울 때 쓰는 함수
			this.totalPage = Math.ceil(this.list.length/12);
		}
		
	}
	
	findById(id){
		for(var ix in this.list){
			if(id == this.list[ix].id){
				return ix;
			}
		}
		return -1;
	}
}


