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

@SuppressWarnings("all") public class bagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bagof_$Is$Imported_0_0 instance = new bagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_IsImported_0_0");
    Fail21973:
    { 
      TermReference l_4287 = new TermReference();
      TermReference m_4287 = new TermReference();
      if(m_4287.value == null)
        m_4287.value = term;
      else
        if(m_4287.value != term && !m_4287.value.match(term))
          break Fail21973;
      if(l_4287.value == null)
        l_4287.value = term;
      else
        if(l_4287.value != term && !l_4287.value.match(term))
          break Fail21973;
      Success11884:
      { 
        Fail21974:
        { 
          IStrategoTerm q_4287 = null;
          q_4287 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, q_4287, trans.const4327, m_4287.value);
          if(term == null)
            break Fail21974;
          if(true)
            break Success11884;
        }
        term = trans.constNil3;
      }
      lifted6721 lifted67210 = new lifted6721();
      lifted67210.l_4287 = l_4287;
      lifted67210.m_4287 = m_4287;
      term = filter_1_0.instance.invoke(context, term, lifted67210);
      if(term == null)
        break Fail21973;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}