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

@SuppressWarnings("all") public class reverse_bagof_$Is$Imported_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Is$Imported_1_0 instance = new reverse_bagof_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4287)
  { 
    context.push("reverse_bagof_IsImported_1_0");
    Fail21971:
    { 
      TermReference e_4287 = new TermReference();
      TermReference f_4287 = new TermReference();
      if(f_4287.value == null)
        f_4287.value = term;
      else
        if(f_4287.value != term && !f_4287.value.match(term))
          break Fail21971;
      if(e_4287.value == null)
        e_4287.value = term;
      else
        if(e_4287.value != term && !e_4287.value.match(term))
          break Fail21971;
      Success11883:
      { 
        Fail21972:
        { 
          IStrategoTerm k_4287 = null;
          k_4287 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_4287, trans.const4327, f_4287.value);
          if(term == null)
            break Fail21972;
          if(true)
            break Success11883;
        }
        term = trans.constNil3;
      }
      lifted6720 lifted67200 = new lifted6720();
      lifted67200.e_4287 = e_4287;
      lifted67200.f_4287 = f_4287;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted67200, h_4287);
      if(term == null)
        break Fail21971;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}