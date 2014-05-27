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

@SuppressWarnings("all") public class bagof_$Source$Dir_0_0 extends Strategy 
{ 
  public static bagof_$Source$Dir_0_0 instance = new bagof_$Source$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_SourceDir_0_0");
    Fail23475:
    { 
      TermReference j_4845 = new TermReference();
      if(j_4845.value == null)
        j_4845.value = term;
      else
        if(j_4845.value != term && !j_4845.value.match(term))
          break Fail23475;
      Success12600:
      { 
        Fail23476:
        { 
          IStrategoTerm m_4845 = null;
          IStrategoTerm o_4845 = null;
          IStrategoTerm p_4845 = null;
          o_4845 = term;
          m_4845 = trans.const4552;
          p_4845 = o_4845;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_4845, m_4845, trans.constCons2047);
          if(term == null)
            break Fail23476;
          if(true)
            break Success12600;
        }
        term = trans.constNil4;
      }
      lifted7001 lifted70010 = new lifted7001();
      lifted70010.j_4845 = j_4845;
      term = filter_1_0.instance.invoke(context, term, lifted70010);
      if(term == null)
        break Fail23475;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}