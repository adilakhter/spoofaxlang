package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
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
    Fail76160:
    { 
      TermReference o_92084 = new TermReference();
      TermReference p_92084 = new TermReference();
      if(p_92084.value == null)
        p_92084.value = term;
      else
        if(p_92084.value != term && !p_92084.value.match(term))
          break Fail76160;
      if(o_92084.value == null)
        o_92084.value = term;
      else
        if(o_92084.value != term && !o_92084.value.match(term))
          break Fail76160;
      Success41819:
      { 
        Fail76161:
        { 
          IStrategoTerm t_92084 = null;
          t_92084 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, t_92084, trans.const15450, p_92084.value);
          if(term == null)
            break Fail76161;
          if(true)
            break Success41819;
        }
        term = trans.constNil11;
      }
      lifted21603 lifted216030 = new lifted21603();
      lifted216030.o_92084 = o_92084;
      lifted216030.p_92084 = p_92084;
      term = filter_1_0.instance.invoke(context, term, lifted216030);
      if(term == null)
        break Fail76160;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}