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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4737)
  { 
    context.push("reject_or_get_ast_from_parsing_1_0");
    Fail22830:
    { 
      IStrategoTerm s_4737 = null;
      IStrategoTerm t_4737 = null;
      IStrategoTerm u_4737 = null;
      s_4737 = term;
      term = parse_file_0_0.instance.invoke(context, s_4737);
      if(term == null)
        break Fail22830;
      t_4737 = term;
      Success12166:
      { 
        Fail22831:
        { 
          IStrategoTerm v_4737 = null;
          v_4737 = term;
          term = t_4737;
          IStrategoTerm term12200 = term;
          Success12167:
          { 
            Fail22832:
            { 
              term = w_4737.invoke(context, term);
              if(term == null)
                break Fail22832;
              { 
                if(true)
                  break Fail22831;
                if(true)
                  break Success12167;
              }
            }
            term = term12200;
          }
          term = v_4737;
          { 
            term = trans.constNone0;
            u_4737 = trans.constNone0;
            if(true)
              break Success12166;
          }
        }
        term = t_4737;
        u_4737 = t_4737;
      }
      term = u_4737;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}