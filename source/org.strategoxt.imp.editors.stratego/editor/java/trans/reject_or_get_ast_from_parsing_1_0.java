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

@SuppressWarnings("all") public class reject_or_get_ast_from_parsing_1_0 extends Strategy 
{ 
  public static reject_or_get_ast_from_parsing_1_0 instance = new reject_or_get_ast_from_parsing_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4184)
  { 
    context.push("reject_or_get_ast_from_parsing_1_0");
    Fail21354:
    { 
      IStrategoTerm a_4184 = null;
      IStrategoTerm b_4184 = null;
      IStrategoTerm c_4184 = null;
      a_4184 = term;
      term = parse_file_0_0.instance.invoke(context, a_4184);
      if(term == null)
        break Fail21354;
      b_4184 = term;
      Success11457:
      { 
        Fail21355:
        { 
          IStrategoTerm d_4184 = null;
          d_4184 = term;
          term = b_4184;
          IStrategoTerm term11491 = term;
          Success11458:
          { 
            Fail21356:
            { 
              term = e_4184.invoke(context, term);
              if(term == null)
                break Fail21356;
              { 
                if(true)
                  break Fail21355;
                if(true)
                  break Success11458;
              }
            }
            term = term11491;
          }
          term = d_4184;
          { 
            term = trans.constNone0;
            c_4184 = trans.constNone0;
            if(true)
              break Success11457;
          }
        }
        term = b_4184;
        c_4184 = b_4184;
      }
      term = c_4184;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}