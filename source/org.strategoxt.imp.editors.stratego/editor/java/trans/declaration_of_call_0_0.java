package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class declaration_of_call_0_0 extends Strategy 
{ 
  public static declaration_of_call_0_0 instance = new declaration_of_call_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("declaration_of_call_0_0");
    Fail21303:
    { 
      IStrategoTerm i_4171 = null;
      TermReference j_4171 = new TermReference();
      TermReference k_4171 = new TermReference();
      TermReference l_4171 = new TermReference();
      IStrategoTerm m_4171 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21303;
      IStrategoTerm arg7581 = term.getSubterm(0);
      if(arg7581.getTermType() != IStrategoTerm.APPL || Main._consCallT_3 != ((IStrategoAppl)arg7581).getConstructor())
        break Fail21303;
      IStrategoTerm arg7582 = arg7581.getSubterm(0);
      if(arg7582.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7582).getConstructor())
        break Fail21303;
      IStrategoTerm arg7583 = arg7582.getSubterm(0);
      if(j_4171.value == null)
        j_4171.value = arg7583;
      else
        if(j_4171.value != arg7583 && !j_4171.value.match(arg7583))
          break Fail21303;
      IStrategoList annos663 = arg7583.getAnnotations();
      if(annos663.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos663).isEmpty())
        break Fail21303;
      if(k_4171.value == null)
        k_4171.value = ((IStrategoList)annos663).head();
      else
        if(k_4171.value != ((IStrategoList)annos663).head() && !k_4171.value.match(((IStrategoList)annos663).head()))
          break Fail21303;
      IStrategoTerm arg7584 = ((IStrategoList)annos663).tail();
      if(arg7584.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7584).isEmpty())
        break Fail21303;
      i_4171 = term.getSubterm(1);
      m_4171 = term;
      term = i_4171;
      lifted6452 lifted64520 = new lifted6452();
      lifted64520.j_4171 = j_4171;
      lifted64520.k_4171 = k_4171;
      lifted64520.l_4171 = l_4171;
      term = oncetd_1_0.instance.invoke(context, term, lifted64520);
      if(term == null)
        break Fail21303;
      term = m_4171;
      if(l_4171.value == null)
        break Fail21303;
      term = l_4171.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}