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

@SuppressWarnings("all") public class bigbagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$Imported_0_0 instance = new bigbagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsImported_0_0");
    Fail76155:
    { 
      TermReference r_92083 = new TermReference();
      TermReference s_92083 = new TermReference();
      if(s_92083.value == null)
        s_92083.value = term;
      else
        if(s_92083.value != term && !s_92083.value.match(term))
          break Fail76155;
      if(r_92083.value == null)
        r_92083.value = term;
      else
        if(r_92083.value != term && !r_92083.value.match(term))
          break Fail76155;
      Success41817:
      { 
        Fail76156:
        { 
          IStrategoTerm w_92083 = null;
          w_92083 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, w_92083, trans.const15450, s_92083.value);
          if(term == null)
            break Fail76156;
          if(true)
            break Success41817;
        }
        term = trans.constNil11;
      }
      lifted21600 lifted216000 = new lifted21600();
      lifted216000.r_92083 = r_92083;
      lifted216000.s_92083 = s_92083;
      term = filter_1_0.instance.invoke(context, term, lifted216000);
      if(term == null)
        break Fail76155;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}