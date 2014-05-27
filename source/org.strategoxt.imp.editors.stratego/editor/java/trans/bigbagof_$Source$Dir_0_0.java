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

@SuppressWarnings("all") public class bigbagof_$Source$Dir_0_0 extends Strategy 
{ 
  public static bigbagof_$Source$Dir_0_0 instance = new bigbagof_$Source$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_SourceDir_0_0");
    Fail23470:
    { 
      TermReference j_4844 = new TermReference();
      if(j_4844.value == null)
        j_4844.value = term;
      else
        if(j_4844.value != term && !j_4844.value.match(term))
          break Fail23470;
      Success12598:
      { 
        Fail23471:
        { 
          IStrategoTerm m_4844 = null;
          IStrategoTerm o_4844 = null;
          IStrategoTerm p_4844 = null;
          o_4844 = term;
          m_4844 = trans.const4552;
          p_4844 = o_4844;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, p_4844, m_4844, trans.constCons2047);
          if(term == null)
            break Fail23471;
          if(true)
            break Success12598;
        }
        term = trans.constNil4;
      }
      lifted6998 lifted69980 = new lifted6998();
      lifted69980.j_4844 = j_4844;
      term = filter_1_0.instance.invoke(context, term, lifted69980);
      if(term == null)
        break Fail23470;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}