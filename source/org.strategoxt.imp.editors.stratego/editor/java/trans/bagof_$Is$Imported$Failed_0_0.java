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

@SuppressWarnings("all") public class bagof_$Is$Imported$Failed_0_0 extends Strategy 
{ 
  public static bagof_$Is$Imported$Failed_0_0 instance = new bagof_$Is$Imported$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_IsImportedFailed_0_0");
    Fail23681:
    { 
      TermReference m_4880 = new TermReference();
      TermReference n_4880 = new TermReference();
      if(n_4880.value == null)
        n_4880.value = term;
      else
        if(n_4880.value != term && !n_4880.value.match(term))
          break Fail23681;
      if(m_4880.value == null)
        m_4880.value = term;
      else
        if(m_4880.value != term && !m_4880.value.match(term))
          break Fail23681;
      Success12673:
      { 
        Fail23682:
        { 
          IStrategoTerm r_4880 = null;
          r_4880 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, r_4880, trans.const4576, n_4880.value);
          if(term == null)
            break Fail23682;
          if(true)
            break Success12673;
        }
        term = trans.constNil4;
      }
      lifted7073 lifted70730 = new lifted7073();
      lifted70730.m_4880 = m_4880;
      lifted70730.n_4880 = n_4880;
      term = filter_1_0.instance.invoke(context, term, lifted70730);
      if(term == null)
        break Fail23681;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}