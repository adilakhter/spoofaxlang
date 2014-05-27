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

@SuppressWarnings("all") public class read_stratego_signatures_0_0 extends Strategy 
{ 
  public static read_stratego_signatures_0_0 instance = new read_stratego_signatures_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("read_stratego_signatures_0_0");
    Fail23134:
    { 
      IStrategoTerm f_4788 = null;
      IStrategoTerm g_4788 = null;
      IStrategoTerm h_4788 = null;
      g_4788 = term;
      IStrategoTerm term12467 = term;
      Success12374:
      { 
        Fail23135:
        { 
          term = fetch_library_ast_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23135;
          h_4788 = term;
          if(true)
            break Success12374;
        }
        term = term12467;
        IStrategoTerm p_4788 = null;
        p_4788 = term;
        term = guarantee_extension_0_1.instance.invoke(context, p_4788, trans.const4578);
        if(term == null)
          break Fail23134;
        f_4788 = term;
        Success12375:
        { 
          Fail23136:
          { 
            IStrategoTerm i_4788 = null;
            i_4788 = term;
            IStrategoTerm term12469 = term;
            Success12376:
            { 
              Fail23137:
              { 
                term = termFactory.makeTuple(f_4788, g_4788);
                term = is_newer_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23137;
                if(true)
                  break Success12376;
              }
              term = term12469;
              Success12377:
              { 
                Fail23138:
                { 
                  IStrategoTerm term12471 = term;
                  Success12378:
                  { 
                    Fail23139:
                    { 
                      term = file_exists_0_0.instance.invoke(context, g_4788);
                      if(term == null)
                        break Fail23139;
                      { 
                        if(true)
                          break Fail23138;
                        if(true)
                          break Success12378;
                      }
                    }
                    term = term12471;
                  }
                  if(true)
                    break Success12377;
                }
                IStrategoTerm r_4788 = null;
                r_4788 = g_4788;
                term = has_extension_0_1.instance.invoke(context, r_4788, trans.const4578);
                if(term == null)
                  break Fail23136;
              }
            }
            term = i_4788;
            { 
              term = file_exists_0_0.instance.invoke(context, f_4788);
              if(term == null)
                break Fail23134;
              term = $Read$From$File_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23134;
              h_4788 = term;
              if(true)
                break Success12375;
            }
          }
          term = parse_stratego_file_0_0.instance.invoke(context, g_4788);
          if(term == null)
            break Fail23134;
          h_4788 = term;
        }
      }
      term = to_signatures_0_0.instance.invoke(context, h_4788);
      if(term == null)
        break Fail23134;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}