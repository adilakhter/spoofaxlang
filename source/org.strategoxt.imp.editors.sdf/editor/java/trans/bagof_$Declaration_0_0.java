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

@SuppressWarnings("all") public class bagof_$Declaration_0_0 extends Strategy 
{ 
  public static bagof_$Declaration_0_0 instance = new bagof_$Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_Declaration_0_0");
    Fail76290:
    { 
      TermReference c_92106 = new TermReference();
      TermReference d_92106 = new TermReference();
      if(d_92106.value == null)
        d_92106.value = term;
      else
        if(d_92106.value != term && !d_92106.value.match(term))
          break Fail76290;
      if(c_92106.value == null)
        c_92106.value = term;
      else
        if(c_92106.value != term && !c_92106.value.match(term))
          break Fail76290;
      Success41854:
      { 
        Fail76291:
        { 
          IStrategoTerm h_92106 = null;
          h_92106 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, h_92106, trans.const15522, d_92106.value);
          if(term == null)
            break Fail76291;
          if(true)
            break Success41854;
        }
        term = trans.constNil11;
      }
      lifted21648 lifted216480 = new lifted21648();
      lifted216480.c_92106 = c_92106;
      lifted216480.d_92106 = d_92106;
      term = filter_1_0.instance.invoke(context, term, lifted216480);
      if(term == null)
        break Fail76290;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}